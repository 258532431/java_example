package demo2.abstract_factory;

/**
 * @Author: yangchenglong on 2019/7/23
 * @Description: 苹果
 * update by:
 * @Param:
 * @return:
 */
public class Apple implements FruitService {

    @Override
    public void eat() {
        System.out.println("从苹果工厂拿来了苹果");
    }

}
