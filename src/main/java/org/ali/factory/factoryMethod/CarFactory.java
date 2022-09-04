package org.ali.factory.factoryMethod;

/**
 * Author: lury
 * Date: 2022-09-04 20:59
 */
public class CarFactory {
    public Moveable create() {
        System.out.println("a car created");
        return new Car();
    }
}
