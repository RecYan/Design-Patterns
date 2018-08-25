package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/25.
 * 双重检测同步延时加载
 * 为了在保证单例的前提下提高运行效率，我们需要对 singleton实例 进行第二次检查，
 *     目的是避开过多的同步（因为这里的同步只需在第一次创建实例时才同步，一旦创建成功，以后获取实例时就不需要同步获取锁了）
 */
public class Singleton6 {

    //1.构造函数私有化，禁止外部访问
    private Singleton6() {

    }

    /**2.使用volatile关键字防止重排序，
     *  因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
     *      memory = allocate();        //1:分配对象的内存空间
            ctorInstance(memory);       //2:初始化对象
            singleton6 = memory;        //3:使singleton3指向刚分配的内存地址
            三者执行的顺序 在JIT 编辑器中可能发生指令重排序 即 1-3-2
     *
     */
    private static volatile Singleton6 instance;

    //3.对外提供静态的get方法来获取实例
    public static Singleton6 getInstance() {
        //双重检查
        if(instance == null) {
            //使用同步代码块
            synchronized (Singleton6.class) { //1
                //3.1加入判断 没有实例时才创建
                if(instance == null) {        //2
                    instance = new Singleton6();  //3 不使用volatile修饰 在这边可能会发生重排序情况
                }
            }
        }
        return instance;
    }
}
