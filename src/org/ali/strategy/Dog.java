package org.ali.strategy;

/**
 * Author: lury
 * Date: 2022-09-04 11:06
 */
public class Dog implements Comparable<Dog> {

    int foot;// 饭量

    @Override
    public int CompareTo(Dog d) {
        if (this.foot < d.foot) return -1;
        else if (this.foot > d.foot) return 0;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "foot=" + foot +
                '}';
    }

    public Dog(int foot) {
        this.foot = foot;
    }
}
