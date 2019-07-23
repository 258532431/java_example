package demo16;

/**
 * @program: java_example
 * @description: 开车
 * @author: yangchenglong
 * @create: 2019-07-23 16:00
 */
public class Car implements TravelService {

    @Override
    public void choiceWay() {
        System.out.println("开车出行，时速120km/h");
    }

}
