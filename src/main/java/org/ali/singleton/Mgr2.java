package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 8:59
 * 与Mgr1类似
 */
public class Mgr2 {
    // JVM保证每个class只能load进内存一次,static变量是class load完马上初始化的，保证只能初始化一次
    private static final Mgr2 INSTANCE;
    static {
        INSTANCE = new Mgr2();
    }

    private Mgr2(){};// 最关键，其他类无法new

    public static Mgr2 getInstance(){return  INSTANCE;};

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr2 mgr21 = Mgr2.getInstance();
        Mgr2 mgr22 = Mgr2.getInstance();
        System.out.println(mgr21 == mgr22);
    }
}
