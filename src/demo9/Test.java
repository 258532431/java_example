package demo9;

/**
 * @program: java_example
 * @description: 装饰器模式-测试类
 * @author: yangchenglong
 * @create: 2019-07-23 17:15
 */
public class Test {

    //意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
    //主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
    //何时使用：在不想增加很多子类的情况下扩展类。
    //如何解决：将具体功能职责划分，同时继承装饰者模式。
    //关键代码： 1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。
    //使用场景：
    // 1、扩展一个类的功能。
    // 2、动态增加功能，动态撤销。

    //M416自动步枪，只能打近距离和中距离（太远看不见），通过装饰器加装六倍镜，增加打击远距离的能力

    public static void main(String[] args) {
        GunsService m416 = new M416();
        m416.shot();

        GunsService sixm416 = new EnhanceM416Decorator(new M416());
        sixm416.shot();
    }

}
