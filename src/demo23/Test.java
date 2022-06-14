package demo23;

/**
 * @Author YangChengLong
 * @Date 2022/6/14
 * @Description: 责任链模式
 */
public class Test {

    // 适用场景：一个请求需要多个对象处理
    // 比如请假天数不一样，审批人不一样；或者是产品检验有多个检验步骤，不同的人检验不同部件

    public static void main(String[] args) {
        ShortLeave l1 = new ShortLeave();
        l1.setNext(new LongLeave());
        l1.handler(2);
        System.out.println("------------");
        l1.handler(5);
    }

}
