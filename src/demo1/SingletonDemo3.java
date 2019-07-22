package demo1;

/**
 * @program: java_example
 * @description: 单例模式-静态内部类方式，线程安全，调用效率高，可延时加载
 * @author: yangchenglong
 * @create: 2019-07-22 16:03
 */
public class SingletonDemo3 {

    //私有静态内部类
    private static class SingletonDemo3Instance {
        private static final SingletonDemo3 newInstance = new SingletonDemo3();
    }

    //必须是私有的构造方法
    private SingletonDemo3(){}

    public static SingletonDemo3 newInstance(){
        return  SingletonDemo3Instance.newInstance;
    }

}
