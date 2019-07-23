package demo2.abstract_factory;

/**
 * @program: java_example
 * @description: 抽象工厂模式-测试类
 * @author: yangchenglong
 * @create: 2019-07-23 14:00
 */
public class Test {

    //意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
    //主要解决：主要解决接口选择的问题。
    //何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
    //如何解决：在一个产品族里面，定义多个产品。
    //关键代码：在一个工厂里聚合多个同类产品。

    public static void main(String[] args) {
        AbstractFruitFactory fruitFactory = FactoryProducer.getFactory("fruitFactory");
        FruitService apple = fruitFactory.getFruit("apple");
        apple.eat();

        FruitService banana = fruitFactory.getFruit("banana");
        banana.eat();
    }

}
