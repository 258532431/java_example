package demo2.abstract_factory;

/**
 * @program: java_example
 * @description: 水果工厂
 * @author: yangchenglong
 * @create: 2019-07-23 13:55
 */
public class FruitFactory extends AbstractFruitFactory {

    @Override
    public FruitService getFruit(String fruitName) {
        if("apple".equalsIgnoreCase(fruitName)){
            return new Apple();
        }
        if("banana".equalsIgnoreCase(fruitName)){
            return new Banana();
        }

        return null;
    }

}
