package demo10.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @program: java_example
 * @description: 动态代理-测试类
 * @author: yangchenglong
 * @create: 2019-08-02 17:48
 */
public class Test {

    //java自带的动态代理
    // java.lang.reflect.Proxy:生成动态代理类和对象；
    // java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现对真实角色的代理访问。
    //每次通过 Proxy 生成的代理类对象都要指定对应的处理器对象

    public static void main(String[] args) {
        Subject people = new People();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(people);
        //获取代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        proxyClass.speak();
        proxyClass.hear();
    }

    //Cglib 动态代理是针对代理的类, 动态生成一个子类, 然后子类覆盖代理类中的方法, 如果是private或是final类修饰的方法,则不会被重写。
    //CGLIB是一个功能强大，高性能的代码生成包。它为没有实现接口的类提供代理，为JDK的动态代理提供了很好的补充。
    // 通常可以使用Java的动态代理创建代理，但当要代理的类没有实现接口或者为了更好的性能，CGLIB是一个好的选择。
    //CGLIB作为一个开源项目，其代码托管在github，地址为：https://github.com/cglib/cglib

}
