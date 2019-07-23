package demo7;

/**
 * @program: java_example
 * @description: SD卡读写接口实现类
 * @author: yangchenglong
 * @create: 2019-07-23 15:40
 */
public class SDCardServiceImpl implements SDCardService{

    @Override
    public void readSD() {
        System.out.println("读取了SD卡内容");
    }

    @Override
    public void writeSD() {
        System.out.println("写入了SD卡内容");
    }
}
