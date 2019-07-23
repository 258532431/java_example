package demo2.abstract_factory;

/**
 * @program: java_example
 * @description: 香蕉
 * @author: yangchenglong
 * @create: 2019-07-23 09:32
 */
public class Banana implements FruitService {

    @Override
    public void eat() {
        System.out.println("从香蕉工厂拿来了香蕉");
    }

}
