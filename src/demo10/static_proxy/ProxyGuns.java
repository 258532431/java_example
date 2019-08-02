package demo10.static_proxy;

/**
 * @program: java_example
 * @description: 枪支代理商
 * @author: yangchenglong
 * @create: 2019-07-23 17:08
 */
public class ProxyGuns implements BuyGuns {

    private AmericaGuns americaGuns = new AmericaGuns();

    private String money;//人民币

    public ProxyGuns(String money) {
        System.out.println("代理商收了"+money);
        this.money = money;
    }

    @Override
    public void buyGuns() {
        americaGuns.buyGuns();
    }

}
