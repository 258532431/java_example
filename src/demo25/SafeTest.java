package demo25;

/**
 * @program: java_example
 * @description: 线程安全-测试类
 * @author: yangchenglong
 * @create: 2019-07-25 15:13
 */
public class SafeTest {

    //volatile修饰要共享的变量（保证代码的有序性，禁止指令重排）， 然后通过ReentrantLock加锁买票，买完解锁，保证同一时间只有一个线程操作变量

    public static void main(String[] args) {
        SafeTicket ticket = new SafeTicket();

        SafeThread noSafeThread1 = new SafeThread("1号窗口", ticket);
        SafeThread noSafeThread2 = new SafeThread("2号窗口", ticket);
        SafeThread noSafeThread3 = new SafeThread("3号窗口", ticket);

        Thread thread1 = new Thread(noSafeThread1);
        Thread thread2 = new Thread(noSafeThread2);
        Thread thread3 = new Thread(noSafeThread3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

