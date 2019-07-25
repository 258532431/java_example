package demo18;

/**
 * @Author: yangchenglong on 2019/7/25
 * @Description: 目标-被观察者
 * update by: 
 * @Param: 
 * @return: 
 */
public interface Subject {

    void addObserver(Observer observer);//添加观察者

    void removeObserver(Observer observer);//移除观察者

    void notifyObserver();//通知观察者

}
