package demo1;

import javax.annotation.Resource;

/**
 * @program: java_example
 * @description: 单例模式-枚举方式，线程安全，调用效率高，不能延时加载，可以防止反射和反序列化调用
 * @author: yangchenglong
 * @create: 2019-07-22 16:03
 */
public class SingletonDemo4 {

    //必须是私有的构造方法
    private SingletonDemo4(){}

    public static SingletonDemo4 newInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }

    private enum SingletonEnum {
        INSTANCE;//枚举类属性是static final的

        private SingletonDemo4 singletonDemo;

        //构造方法实例化对象，JVM保证这个方法绝对只调用一次
        SingletonEnum() {
            singletonDemo = new SingletonDemo4();
        }

        public SingletonDemo4 getInstance(){
            return singletonDemo;
        }

    }

}
