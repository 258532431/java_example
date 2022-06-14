package demo23;

/**
 * @Author YangChengLong
 * @Date 2022/6/14
 * @Description: TODO
 */
public abstract class Leave {

    private Leave next;

    abstract void handler(int days);

    public Leave getNext() {
        return next;
    }

    public void setNext(Leave next) {
        this.next = next;
    }
}
