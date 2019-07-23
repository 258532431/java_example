package demo2.simple_factory;

/**
 * @program: java_example
 * @description: 香蕉工厂生产香蕉（对象）
 * @author: yangchenglong
 * @create: 2019-07-23 09:35
 */
public class BananaFactory implements FruitFactory {

    @Override
    public FruitService produce() {
        return new Banana();
    }

}
