package org.ali.factory.abstractFactory;

/**
 * Author: lury
 * Date: 2022-09-04 19:18
 */
public class Main {
    public static void main(String[] args) {
        // AbstractFactory factory = new ModernFactory();
        AbstractFactory factory = new MagicFactory();
        Foot foot = factory.createFoot();
        foot.printName();

        Vihicle vihicle = factory.createVihicle();
        vihicle.go();

        Weapon weapon = factory.createWeapon();
        weapon.shoot();
    }
}
