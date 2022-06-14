package demo29;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author YangChengLong
 * @Date 2022/6/14
 * @Description: TODO
 */
public class ProxyHandler implements InvocationHandler {

    private People people;

    public ProxyHandler(People people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Please say");
        Object invoke = method.invoke(people, args);
        System.out.println("Please sit down");
        return invoke;
    }

}
