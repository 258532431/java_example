package demo25;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java_example
 * @description: 安全的线程类-买票
 * @author: yangchenglong
 * @create: 2019-07-25 15:11
 */
public class SafeThread extends Thread {

    private String name;
    private SafeTicket ticket;
    private static ReentrantLock lock = new ReentrantLock();

    public SafeThread(String name, SafeTicket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            boolean flag = buy(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!flag)
                break;
        }
    }

    public boolean buy(String name){
        try {
            lock.lock();
            if(ticket.num <= 0){
                System.out.println(name + "来买，但卖光了，剩余车票："+ticket.num);
                return false;
            }
            ticket.num --;
            System.out.println(name + "买走1张，剩余车票数量："+ticket.num);
            return true;
        } catch (Exception e) {
            System.out.println("锁异常: "+e.getMessage());
            return false;
        } finally {
            lock.unlock();
        }
    }

}
