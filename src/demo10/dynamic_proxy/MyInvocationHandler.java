package demo10.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: java_example
 * @description: 定义一个动态代理处理器
 * @author: yangchenglong
 * @create: 2019-08-02 17:54
 */
public class MyInvocationHandler implements InvocationHandler {

    //因为需要处理真实角色，所以要把真实角色传进来
    Subject people;

    public MyInvocationHandler(Subject people) {
        this.people = people;
    }

    /**
     * @Author: yangchenglong on 2019/8/2
     * @Description: 代理方法
     * update by: 
     * @Param: 【proxy：代理类，method：代理方法，args：方法的参数】
     * @return: 
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在调用代理类...");
        method.invoke(people, args);//通过反射调用实际类的方法
        return null;
    }
}
