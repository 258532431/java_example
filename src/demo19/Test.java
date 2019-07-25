package demo19;

/**
 * @program: java_example
 * @description: 备忘录模式-测试类
 * @author: yangchenglong
 * @create: 2019-07-25 14:06
 */
public class Test {

    //意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
    //主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
    //何时使用：很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。
    //如何解决：通过一个备忘录类专门存储对象状态。
    //关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
    //应用实例： 1、后悔药。 2、打游戏时的存档。 3、Windows 里的 ctri + z。 4、IE 中的后退。 4、数据库的事务管理。
    //优点： 1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 2、实现了信息的封装，使得用户不需要关心状态的保存细节。
    //缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
    //使用场景： 1、需要保存/恢复数据的相关状态场景。 2、提供一个可回滚的操作。
    //注意事项： 1、为了符合迪米特原则，还要增加一个管理备忘录的类。 2、为了节约内存，可使用原型模式+备忘录模式。

    //小明借给小红100元，同时在备忘录记录了自己借给小红100元，防止遗忘， 当小明忘记时，可从备忘录查看

    public static void main(String[] args) {
        Originator xiaoming = new Originator();//小明
        Caretaker caretaker = new Caretaker();//负责人
        xiaoming.setName("小红");
        xiaoming.setAmt(100);
        System.out.println("小明借给小红100元");

        Memento memento = xiaoming.saveToMemento();
        System.out.println("小明怕忘记，写进了备忘录");
        caretaker.add(memento);//负责人保管备忘录

        xiaoming.setName("小黄");
        xiaoming.setAmt(200);
        System.out.println("小明又借给小黄100元");
        memento = xiaoming.saveToMemento();
        System.out.println("小明也怕忘记，又写进了备忘录");
        caretaker.add(memento);//负责人保管备忘录

        System.out.println("------------ 小明忘记了，开始翻看备忘录 --------------");
        System.out.println(caretaker.get(0).getContent());
        System.out.println(caretaker.get(1).getContent());

    }

}
