package demo19;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java_example
 * @description: 负责人-负责恢复数据
 * @author: yangchenglong
 * @create: 2019-07-25 14:52
 */
public class Caretaker {

    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento){
        list.add(memento);
    }

    public Memento get(int index){
        return list.get(index);
    }

}
