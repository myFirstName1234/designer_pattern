package org.ali.strategy;

import java.util.Arrays;

/**
 * Author: lury
 * Date: 2022-09-04 11:08
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(1,7),new Cat(3,4)};
        Dog[] dogs = {new Dog(2),new Dog(4)};

        new Sorter<Cat>().sort(cats,((o1, o2) ->
            o1.height - o2.height < 0 ? -1 : 1
        ));

        System.out.println(Arrays.toString(cats));

    }
}
