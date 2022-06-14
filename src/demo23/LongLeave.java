package demo23;

/**
 * @Author YangChengLong
 * @Date 2022/6/14
 * @Description: TODO
 */
public class LongLeave extends Leave {

    @Override
    void handler(int days) {
        if (days >= 3 && days < 7) {
            System.out.println("经理审批通过了");
        } else {
            if (getNext() != null) {
                getNext().handler(days);
            }
        }
    }

}
