package demo19;

/**
 * @program: java_example
 * @description: 小明（原发器-负责存储数据到备忘录）
 * @author: yangchenglong
 * @create: 2019-07-25 14:47
 */
public class Originator {

    private String name;//姓名
    private long amt;//金额

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmt() {
        return amt;
    }

    public void setAmt(long amt) {
        this.amt = amt;
    }

    //保存信息到备忘录
    public Memento saveToMemento(){
        return new Memento(name, amt);
    }

    //从备忘录获取信息
    public String getContentFromMemento(Memento memento){
        return memento.getContent();
    }
}
