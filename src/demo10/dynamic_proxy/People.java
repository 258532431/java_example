package demo10.dynamic_proxy;

/**
 * @program: java_example
 * @description: 人类
 * @author: yangchenglong
 * @create: 2019-08-02 17:53
 */
public class People implements Subject {

    @Override
    public void speak() {
        System.out.println("人类说话了");
    }

    @Override
    public void hear() {
        System.out.println("人类在听...");
    }

}
