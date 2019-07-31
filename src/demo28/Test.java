package demo28;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: java_example
 * @description: 延迟队列-测试类
 * @author: yangchenglong
 * @create: 2019-07-31 15:05
 */
public class Test {

    public static void main(String[] args) {
        // 创建延时队列
        DelayQueue<Message> queue = new DelayQueue<>();
        // 添加延时消息,m1 延时10s
        Message m1 = new Message("我是张三", 10000);
        // 添加延时消息,m2 延时5s
        Message m2 = new Message("我是李四", 5000);
        //将延时消息放到延时队列中
        queue.offer(m1);
        queue.offer(m2);
        // 启动消费线程 消费添加到延时队列中的消息，前提是任务到了延期时间
        new Consumer(queue).run();
    }

}
