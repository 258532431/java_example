package demo14;

/**
 * @program: java_example
 * @description: 游戏
 * @author: yangchenglong
 * @create: 2019-08-01 09:41
 */
public abstract class Game {

    abstract void init();//初始化加载

    abstract void start();//开始游戏

    abstract void end();//结束游戏

    public final void play(){
        init();
        start();
        end();
    }

}
