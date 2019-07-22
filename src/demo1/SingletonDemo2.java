package demo1;

/**
 * @program: java_example
 * @description: 单例模式-懒汉式，需用volatile（禁止指令重排）保证线程安全，调用效率低，可延时加载
 * @author: yangchenglong
 * @create: 2019-07-22 16:03
 */
public class SingletonDemo2 {

    //volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障，这样，在它的赋值完成之前，就不用会调用读操作
    private static volatile SingletonDemo2 singletonDemo;

    //必须是私有的构造方法
    private SingletonDemo2(){}

    //双重加锁
    public static SingletonDemo2 newInstance(){
        if(singletonDemo == null) {
            synchronized (SingletonDemo2.class) {
                if(singletonDemo == null) {
                    singletonDemo = new SingletonDemo2();
                }
            }
        }
        return  singletonDemo;
    }

}
