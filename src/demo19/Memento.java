package demo19;

/**
 * @program: java_example
 * @description: 备忘录-用来存储数据, 相当于实体类
 * @author: yangchenglong
 * @create: 2019-07-25 14:42
 */
public class Memento {

    private String name;//姓名
    private long amt;//金额

    public Memento(String name, long amt) {
        this.name = name;
        this.amt = amt;
    }

    public String getContent(){
        String str = "备忘录记录：借给了"+name+" "+amt+"元";
        return str;
    }
}
