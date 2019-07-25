package demo18;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java_example
 * @description: 拍卖师-被观察者
 * @author: yangchenglong
 * @create: 2019-07-25 11:39
 */
public class Auctioneer implements Subject {

    private List<Observer> list;//观察者集合
    private String msg;//信息

    public Auctioneer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!this.list.isEmpty())
            this.list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        //通知所有观察者
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(msg);
        }
    }

    //设置消息内容
    public void setMsg(String msg){
        this.msg = msg;
        System.out.println("来自拍卖师的信息："+msg);
        notifyObserver();
    }

}
