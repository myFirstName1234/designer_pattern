package org.ali.strategy;

/**
 * Author: lury
 * Date: 2022-09-04 11:00
 */
public class Cat implements Comparable<Cat>{
    int weight,height;

    @Override
    public int CompareTo(Cat cat) {
        if (this.weight < cat.weight) return -1;
        else if (this.weight > cat.weight) return 1;
        else return 0;
    }

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
