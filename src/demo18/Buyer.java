package demo18;

/**
 * @program: java_example
 * @description: 买家
 * @author: yangchenglong
 * @create: 2019-07-25 11:48
 */
public class Buyer implements Observer {

    private String name;//买家姓名
    private String msg;//买家收到的信息

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        System.out.println(this.name + " 收到了信息："+this.msg);
    }

}
