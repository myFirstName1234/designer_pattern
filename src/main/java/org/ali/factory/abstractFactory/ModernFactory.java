package org.ali.factory.abstractFactory;

/**
 * Author: lury
 * Date: 2022-09-04 21:42
 */
public class ModernFactory extends AbstractFactory{

    @Override
    Foot createFoot() {
        return new Bread();
    }

    @Override
    Vihicle createVihicle() {
        return new Car() {
        };
    }

    @Override
    Weapon createWeapon() {
        return new Ak47();
    }
}
