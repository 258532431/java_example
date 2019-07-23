package demo7;

/**
 * @program: java_example
 * @description: 适配器模式-测试类
 * @author: yangchenglong
 * @create: 2019-07-23 15:44
 */
public class Test {

    //意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
    //主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
    //何时使用： 1、系统需要使用现有的类，而此类的接口不符合系统的需要。 2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。 3、通过接口转换，将一个类插入另一个类系中。（比如老虎和飞禽，现在多了一个飞虎，在不增加实体的需求下，增加一个适配器，在里面包容一个虎对象，实现飞的接口。）
    //如何解决：继承或依赖（推荐）。
    //关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。

    //电脑现在只有读取SD卡的卡口，我们通过适配器，让电脑可以通过SD卡卡口读取TF卡

    public static void main(String[] args) {
        TFCardService tfCardService = new TFCardServiceImpl();
        SDCardService sdCardService = new SDAdapterTF(tfCardService);
        sdCardService.readSD();
        sdCardService.writeSD();
    }

}
