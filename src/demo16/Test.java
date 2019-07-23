package demo16;

/**
 * @program: java_example
 * @description: 测试类
 * @author: yangchenglong
 * @create: 2019-07-23 16:04
 */
public class Test {

    //不同的旅行，选择不同出行方式
    public static void main(String[] args) {
        Travel travel = new Travel(new Car());
        travel.choiceWay();

        travel = new Travel(new Ride());
        travel.choiceWay();
    }

}
