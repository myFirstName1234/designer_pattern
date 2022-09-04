package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 9:29
 * Mgr4的基础上减少锁住的代码量，然而不可行
 */
public class Mgr5 {
    private static Mgr5 INSTANCE;//最开始不初始化

    private Mgr5(){};// 同样的私有构造

    public static Mgr5 getInstance() {
            if (INSTANCE == null) { // 这里有线程问题
                synchronized(Mgr5.class){// 需要时加锁，试图减少锁住的代码量，然而不可行
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                INSTANCE = new Mgr5(); // 需要的时候初始化
            }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            new Thread(()->{
                System.out.println(Mgr5.getInstance().hashCode());//  同一个类的不同对象hash码不同
            }).start();
        }
    }
}
