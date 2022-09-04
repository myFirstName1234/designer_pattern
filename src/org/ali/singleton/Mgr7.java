package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 9:48
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类
 * 一种完美方案
 */
public class Mgr7 {

    private Mgr7(){}

    private static class Mgr7Holder {// private 修饰保证外部访问不了
        private final static Mgr7 INSTANCE = new Mgr7();// 内部类可以访问外部类私有
    }

    public static Mgr7 getInstance() {
        return Mgr7Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            new Thread(() -> {
                System.out.println(Mgr7.getInstance().hashCode());
            }).start();

        }
    }
}
