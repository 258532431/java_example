package demo25;

/**
 * @program: java_example
 * @description: 线程不安全-测试类
 * @author: yangchenglong
 * @create: 2019-07-25 15:13
 */
public class NoSafeTest {

    //同一张票被不同人买走，或者是卖光了还能买到票，这就是线程安全问题

    public static void main(String[] args) {
        NoSafeTicket ticket = new NoSafeTicket();

        NoSafeThread noSafeThread1 = new NoSafeThread("1号窗口", ticket);
        NoSafeThread noSafeThread2 = new NoSafeThread("2号窗口", ticket);
        NoSafeThread noSafeThread3 = new NoSafeThread("3号窗口", ticket);

        Thread thread1 = new Thread(noSafeThread1);
        Thread thread2 = new Thread(noSafeThread2);
        Thread thread3 = new Thread(noSafeThread3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

