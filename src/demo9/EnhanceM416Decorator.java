package demo9;

/**
 * @program: java_example
 * @description: 增强版M416装饰器类
 * @author: yangchenglong
 * @create: 2019-07-24 16:36
 */
public class EnhanceM416Decorator extends M416Decorator{

    public EnhanceM416Decorator(M416 m416) {
        super(m416);
    }

    @Override
    public void shot() {
        sixLens();
        super.shot();
    }

    public void sixLens(){
        System.out.println("加装了6倍镜, 打远距离");
    }
}
