package org.ali.factory.abstractFactory;

/**
 * Author: lury
 * Date: 2022-09-04 21:44
 */
public class MagicFactory extends AbstractFactory{
    @Override
    Foot createFoot() {
        return new MushRoom();
    }

    @Override
    Vihicle createVihicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
