package demo25;

/**
 * @program: java_example
 * @description: 不安全的线程类-买票
 * @author: yangchenglong
 * @create: 2019-07-25 15:11
 */
public class NoSafeThread extends Thread {

    private String name;
    private NoSafeTicket ticket;

    public NoSafeThread(String name, NoSafeTicket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            boolean flag = buy(name);
            if(!flag)
                break;
        }
    }

    public boolean buy(String name){
        if(ticket.num <= 0){
            System.out.println(name + "来买，但卖光了，剩余车票："+ticket.num);
            return false;
        }
        ticket.num --;
        System.out.println(name + "买走1张，剩余车票数量："+ticket.num);
        return true;
    }

}
