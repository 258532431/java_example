package demo2.abstract_factory;

/**
 * @program: java_example
 * @description: 水果抽象工厂
 * @author: yangchenglong
 * @create: 2019-07-23 13:51
 */
public abstract class AbstractFruitFactory {

    public abstract FruitService getFruit(String fruitName);

}
