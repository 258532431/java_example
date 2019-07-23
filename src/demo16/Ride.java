package demo16;

/**
 * @program: java_example
 * @description: 骑行
 * @author: yangchenglong
 * @create: 2019-07-23 16:01
 */
public class Ride implements TravelService {

    @Override
    public void choiceWay() {
        System.out.println("骑自行车出行，时速20km/h");
    }

}
