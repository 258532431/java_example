package demo10.static_proxy;

/**
 * @program: java_example
 * @description: 美国枪
 * @author: yangchenglong
 * @create: 2019-07-23 17:07
 */
public class AmericaGuns implements BuyGuns {

    @Override
    public void buyGuns() {
        System.out.println("我卖枪只收美元哦");
    }

}
