package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 9:24
 * 加锁优化了Mgr3,却带来了效率低下的问题
 */
public class Mgr4 {
    private static Mgr4 INSTANCE;//最开始不初始化

    private Mgr4(){};// 同样的私有构造

    public synchronized static Mgr4 getInstance() {
        if (INSTANCE == null) { // 这里有线程问题
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr4(); // 需要的时候初始化
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            new Thread(()->{
                System.out.println(Mgr4.getInstance().hashCode());//  同一个类的不同对象hash码不同
            }).start();
        }
    }
}
