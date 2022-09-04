package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 10:04
 * 不仅可以解决线程同步，还可以防止反序列化
 * 也是完美的 perfect
 * effective java 作者创作的
 */
public enum Mgr8 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            new Thread(() -> {
                System.out.println(Mgr8.INSTANCE.hashCode());
            }).start();

        }
    }
}
