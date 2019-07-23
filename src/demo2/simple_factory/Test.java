package demo2.simple_factory;

/**
 * @program: java_example
 * @description: 工厂方法模式-测试类
 * @author: yangchenglong
 * @create: 2019-07-23 09:36
 */
public class Test {

    //工厂方法模式非常符合“开闭原则”，当需要增加一个新的产品时，我们只需要增加一个具体的产品类和与之对应的具体工厂即可，无须修改原有系统。
    // 同时在工厂方法模式中用户只需要知道生产产品的具体工厂即可，无须关系产品的创建过程，甚至连具体的产品类名称都不需要知道。
    // 虽然他很好的符合了“开闭原则”，但是由于每新增一个新产品时就需要增加两个类，这样势必会导致系统的复杂度增加

    //意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
    //主要解决：主要解决接口选择的问题。
    //何时使用：我们明确地计划不同条件下创建不同实例时。
    //如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
    //关键代码：创建过程在其子类执行

    //使用场景：
    // 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
    // 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
    // 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。

    //获得水果
    public static FruitService getFruit(FruitFactory fruitFactory){
        FruitService fruitService = fruitFactory.produce();
        return fruitService;
    }

    public static void main(String[] args) {
        getFruit(new AppleFactory()).eat();
        getFruit(new BananaFactory()).eat();
    }

}
