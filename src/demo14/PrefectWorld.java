package demo14;

/**
 * @program: java_example
 * @description: 完美世界
 * @author: yangchenglong
 * @create: 2019-08-01 09:48
 */
public class PrefectWorld extends Game {
    @Override
    void init() {
        System.out.println("正在初始化完美世界");
    }

    @Override
    void start() {
        System.out.println("完美世界游戏开始");
    }

    @Override
    void end() {
        System.out.println("完美世界游戏结束");
    }
}
