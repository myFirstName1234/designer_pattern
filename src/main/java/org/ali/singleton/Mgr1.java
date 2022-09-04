package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 8:35
 * 饿汉式
 * 类加载到内存后，只有一个实例，JVM保证线程安全
 * 简单使用，推荐实用
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * （话说你不用它，装在它干嘛）
 */
public class Mgr1 {
    // JVM保证每个class只能load进内存一次,static变量是class load完马上初始化的，保证只能初始化一次
    private static final Mgr1 INSTANCE = new Mgr1();

    private Mgr1(){};// 最关键，其他类无法new

    public static Mgr1 getInstance(){return  INSTANCE;};

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr1 mgr11 = Mgr1.getInstance();
        Mgr1 mgr12 = Mgr1.getInstance();
        System.out.println(mgr11 == mgr12);
    }
}
