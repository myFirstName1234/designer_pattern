package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 9:04
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来了多线程失效的问题
 */
public class Mgr3 {
    private static Mgr3 INSTANCE;//最开始不初始化

    private Mgr3(){};// 同样的私有构造

    public static Mgr3 getInstance() {
        if (INSTANCE == null) { // 这里有线程问题
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr3(); // 需要的时候初始化
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            new Thread(()->{
                System.out.println(Mgr3.getInstance().hashCode());//  同一个类的不同对象hash码不同
            }).start();
        }
    }
}
