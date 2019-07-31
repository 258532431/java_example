package demo28;

import java.util.concurrent.DelayQueue;

/**
 * @program: java_example
 * @description: 队列消费者
 * @author: yangchenglong
 * @create: 2019-07-31 16:13
 */
public class Consumer implements Runnable {

    // 延时队列 ,消费者从其中获取消息进行消费
    private DelayQueue<Message> queue;

    public Consumer(DelayQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Message take = queue.take();
                System.out.println("消息体：" + take.getContent());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
