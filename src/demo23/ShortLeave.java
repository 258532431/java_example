package demo23;

/**
 * @Author YangChengLong
 * @Date 2022/6/14
 * @Description: TODO
 */
public class ShortLeave extends Leave {

    @Override
    void handler(int days) {
        System.out.println("组长审批通过了");
        if (getNext() != null) {
            getNext().handler(days);
        }
    }

}
