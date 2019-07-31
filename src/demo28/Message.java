package demo28;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @program: java_example
 * @description: 队列消息体,  实现Delayed接口就是实现两个方法即compareTo 和 getDelay最重要的就是getDelay方法，这个方法用来判断是否到期
 * @author: yangchenglong
 * @create: 2019-07-31 15:49
 */
public class Message implements Delayed {

    private String content;//消息内容

    private long delayTime;//触发时间

    public Message(String content, long delayTime) {
        this.content = content;
        this.delayTime = System.currentTimeMillis() + (delayTime > 0 ? delayTime: 0);
    }

    public String getContent() {
        return content;
    }

    public long getDelayTime() {
        return delayTime;
    }

    //延迟任务是否到时就是按照这个方法判断如果返回的是负数则说明到期否则还没到期
    @Override
    public long getDelay(TimeUnit unit) {
        return this.delayTime - System.currentTimeMillis();
    }

    //自定义实现比较方法返回
    @Override
    public int compareTo(Delayed o) {
        Message msg = (Message) o;
        long diff = this.delayTime - msg.delayTime;
        if (diff <= 0) {
            return -1;
        }else {
            return 1;
        }
    }
}
