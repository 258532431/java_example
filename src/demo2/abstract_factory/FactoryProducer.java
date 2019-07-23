package demo2.abstract_factory;

/**
 * @program: java_example
 * @description: 生产水果工厂
 * @author: yangchenglong
 * @create: 2019-07-23 14:05
 */
public class FactoryProducer {

    public static AbstractFruitFactory getFactory(String factoryName){
        if("fruitFactory".equalsIgnoreCase(factoryName)){
            return new FruitFactory();
        }

        return null;
    }

}
