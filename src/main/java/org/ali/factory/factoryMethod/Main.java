package org.ali.factory.factoryMethod;

/**
 * Author: lury
 * Date: 2022-09-04 19:18
 */
public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();
    }
}
