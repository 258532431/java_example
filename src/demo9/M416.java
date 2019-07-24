package demo9;

/**
 * @program: java_example
 * @description: m416自动步枪
 * @author: yangchenglong
 * @create: 2019-07-24 16:30
 */
public class M416 implements GunsService {

    @Override
    public void shot() {
        System.out.println("M416自动步枪打近中距离");
    }

}
