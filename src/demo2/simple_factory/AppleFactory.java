package demo2.simple_factory;

/**
 * @program: java_example
 * @description: 苹果工厂生产苹果（对象）
 * @author: yangchenglong
 * @create: 2019-07-23 09:33
 */
public class AppleFactory implements FruitFactory {

    @Override
    public FruitService produce() {
        return new Apple();
    }

}
