package demo29;

import java.lang.reflect.Proxy;

/**
 * @Author YangChengLong
 * @Date 2022/6/14
 * @Description: jdk动态代理
 */
public class Test {

    // jdk动态代理通过实现原来的所有接口进行代理，如果原类没有实现接口，则无法代理
    // 代理类处理器实现了InvocationHandler接口，重写invoke方法，在原类方法执行前后增加额外的处理
    // Proxy类通过 newProxyInstance() 方法生成原来的代理类，客户端调用的是代理类的方法

    public static void main(String[] args) {
        People people = new Man();
        ProxyHandler handle = new ProxyHandler(people);
        People proxy = (People) Proxy.newProxyInstance(handle.getClass().getClassLoader(), people.getClass().getInterfaces(), handle);
        proxy.say("I am a Man");
    }

}
