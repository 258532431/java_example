package demo25;

/**
 * @program: java_example
 * @description: 线程安全-测试类
 * @author: yangchenglong
 * @create: 2019-07-25 15:13
 */
public class SafeTest {

    //变量存储在主内存，多核CPU的每个CPU都有自己高速缓存，每个线程处理数据是在高速缓存（工作内存）处理（但不同缓存的数据可能不一样），然后把值刷新到主内存，这样就造成多线程的数据安全问题
    //volatile通过在读写操作前后添加内存屏障，内存屏障的作用：1.阻止屏障两侧指令重排序 2.强制把写缓冲区/高速缓存中的脏数据等写回主内存，让缓存中相应的数据失效。

    //volatile修饰的变量具有的特性：
    //1.可见性，对于一个该变量的读，一定能看到读之前最后的写入。
    //2.原子性，对volatile变量的读写具有原子性，即单纯读和写的操作，都不会受到干扰。

    //volatile修饰要共享的变量， 然后通过ReentrantLock加锁买票，买完解锁，保证同一时间只有一个线程操作变量

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

