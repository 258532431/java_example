package demo2.abstract_factory;

/**
 * @program: java_example
 * @description: 测试类
 * @author: yangchenglong
 * @create: 2019-07-23 14:00
 */
public class Test {

    public static void main(String[] args) {
        AbstractFruitFactory fruitFactory = FactoryProducer.getFactory("fruitFactory");
        FruitService apple = fruitFactory.getFruit("apple");
        apple.eat();

        FruitService banana = fruitFactory.getFruit("banana");
        banana.eat();
    }

}
