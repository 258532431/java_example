package demo7;

/**
 * @program: java_example
 * @description: SD接口读取TF卡的适配器
 * @author: yangchenglong
 * @create: 2019-07-23 15:42
 */
public class SDAdapterTF implements SDCardService {

    private TFCardService tfCardService;

    public SDAdapterTF(TFCardService tfCardService) {
        this.tfCardService = tfCardService;
    }

    @Override
    public void readSD() {
        System.out.println("开始适配TF卡读取");
        tfCardService.readTF();
    }

    @Override
    public void writeSD() {
        System.out.println("开始适配TF卡写入");
        tfCardService.writeTF();
    }

}
