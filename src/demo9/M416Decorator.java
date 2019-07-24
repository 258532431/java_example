package demo9;

/**
 * @program: java_example
 * @description: M416射击装饰器类
 * @author: yangchenglong
 * @create: 2019-07-24 16:33
 */
public abstract class M416Decorator implements GunsService {

    private M416 m416;

    public M416Decorator(M416 m416) {
        this.m416 = m416;
    }

    @Override
    public void shot() {
        m416.shot();
    }

}
