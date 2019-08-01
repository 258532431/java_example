package demo14;

/**
 * @program: java_example
 * @description: 绝地求生
 * @author: yangchenglong
 * @create: 2019-08-01 09:47
 */
public class PUBG extends Game {

    @Override
    void init() {
        System.out.println("正在初始化PUBG");
    }

    @Override
    void start() {
        System.out.println("PUBG游戏开始");
    }

    @Override
    void end() {
        System.out.println("PUBG游戏结束");
    }
}
