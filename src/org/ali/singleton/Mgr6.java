package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 9:40
 * 双检索，曾经是单例的完美的方案
 */
public class Mgr6 {
    private static Mgr6 INSTANCE;//最开始不初始化

    private Mgr6(){};// 同样的私有构造

    public static Mgr6 getInstance() {
        if (INSTANCE == null) { // 这里有线程问题
                //  双检锁
                synchronized (Mgr6.class) {
                    if  (INSTANCE == null) {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        INSTANCE = new Mgr6(); // 需要的时候初始化
                    }
                }

            }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            new Thread(()->{
                System.out.println(Mgr6.getInstance().hashCode());//  同一个类的不同对象hash码不同
            }).start();
        }
    }
}
