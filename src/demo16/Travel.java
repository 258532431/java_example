package demo16;

/**
 * @program: java_example
 * @description: 旅行开始
 * @author: yangchenglong
 * @create: 2019-07-23 16:02
 */
public class Travel {

    private TravelService travelService;

    public Travel(TravelService travelService) {
        this.travelService = travelService;
    }

    public void choiceWay() {
        travelService.choiceWay();
    }
}
