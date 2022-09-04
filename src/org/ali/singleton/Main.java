package org.ali.singleton;

/**
 * Author: lury
 * Date: 2022-09-04 8:35
 */
public class Main {
    public static void main(String[] args) {
        // new Mgr1();怎么办？只能
        Mgr1 mgr1 = Mgr1.getInstance();
    }
}
