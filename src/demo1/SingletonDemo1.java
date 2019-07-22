package demo1;

/**
 * @program: java_example
 * @description: 单例模式-饿汉式，线程安全，调用效率高，但是不能延时加载，有可能造成资源浪费
 * @author: yangchenglong
 * @create: 2019-07-22 16:03
 */
public class SingletonDemo1 {

    private static SingletonDemo1 singletonDemo = new SingletonDemo1();

    //必须是私有的构造方法
    private SingletonDemo1(){}

    public static SingletonDemo1 newInstance(){
        return  singletonDemo;
    }

}
