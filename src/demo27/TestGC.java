package demo27;

/**
 * @program: java_example
 * @description: 垃圾回收-测试类
 * @author: yangchenglong
 * @create: 2019-07-30 14:15
 */
public class TestGC {

    //先在 VM Options 参数配置：  -XX:+PrintGCDetails  ， 开启GC日志打印
    public static void main(String[] args) {
        int _1m = 1024 * 1024;
        byte[] data = new byte[_1m];
        // 将data置为null即让它成为垃圾
        data = null;
        // 通知垃圾回收器回收垃圾
        System.gc();
    }

    /**
     * GC日志分析：
     * 1、日志开头的”[GC”和”[Full GC”说明了这次垃圾收集的停顿类型，如果有”Full”，说明这次GC发生了”Stop-The-World”（停止所有线程来进行GC）。
     *    因为是调用了System.gc()方法触发的收集，所以会显示”[Full GC (System.gc())”，不然是没有后面的(System.gc())的。
     *
     * 2、PSYoungGen 表示（使用Parallel Scavenge垃圾收集器的）新生代区域， ParOldGen 表示（使用Parallel old垃圾收集器的）老生代区域， Metaspace 表示元空间。
     *    （为什么是这两个垃圾收集器组合呢？因为我的jvm开启的模式是Server，而Server模式的默认垃圾收集器组合便是这个，在命令行输入java -version就可以看到自己的jvm默认开启模式。
     *       还有一种是client模式，默认组合是Serial收集器和Serial Old收集器组合。）
     *
     * 3、[PSYoungGen: 3901K->680K(75776K)] 3901K->688K(249344K), 0.0007914 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]  表示
     *    [新生代：gc前当前已使用的容量->gc后已使用的容量(总容量)] gc前Java堆已使用容量->gc后Java堆已使用容量，该区域gc耗时] [时间：user=进程在用户态消耗的CPU时间 ，
     *     sys=进程在内核态消耗的CPU时间 ， real=进程从开始到结束所用的时钟时间]
     *
     * 4、Heap - PSYoungGen ：
     *    a、新生代细分。
     *       1）eden ： Eden空间
     *       2）from Survivor空间：
     *       3）to Survivor空间（保留空间）：
     *
     *    c、其中对象只会存于Eden和From Survivor区域，to Survivor【保留空间】为空，三者默认比例为8:1:1，优先使用Eden区，若Eden区满，
     *       则将对象复制到第二块内存区上。但是不能保证每次回收都只有不多于10%的对象存货，所以Survivor区不够的话，则会依赖老年代年存进行分配
     *
     *    b、新生代采用复制算法，GC进行时，Eden区所有存活的对象都被复制到To Survivor区，而From Survivor区中，仍存活的对象会根据它们的年龄值决定去向，
     *       年龄值达到年龄阈值(默认15是因为对象头中年龄战4bit，新生代每熬过一次垃圾回收，年龄+1)，则移到老年代，没有达到则复制到To Survivor。
     *
     *  5、Metaspace（元空间）： （jdk8废弃了永久代，采用元空间）使用的是本地内存，而不是堆内存，也就是说在默认情况下Metaspace的大小只与本地内存大小有关。也可以配置大小
     *
     */

}
