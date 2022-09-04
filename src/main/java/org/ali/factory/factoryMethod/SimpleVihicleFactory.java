package org.ali.factory.factoryMethod;

/**
 * Author: lury
 * Date: 2022-09-04 20:51
 * 简单工厂的可扩展性不太好
 */
public class SimpleVihicleFactory {
    public Car createCar(){
        // before processing
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }
}
