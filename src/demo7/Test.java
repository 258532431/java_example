package demo7;

/**
 * @program: java_example
 * @description: 测试类
 * @author: yangchenglong
 * @create: 2019-07-23 15:44
 */
public class Test {

    //电脑现在只有读取SD卡的卡口，我们通过适配器，让电脑可以通过SD卡卡口读取TF卡

    public static void main(String[] args) {
        TFCardService tfCardService = new TFCardServiceImpl();
        SDCardService sdCardService = new SDAdapterTF(tfCardService);
        sdCardService.readSD();
        sdCardService.writeSD();
    }

}
