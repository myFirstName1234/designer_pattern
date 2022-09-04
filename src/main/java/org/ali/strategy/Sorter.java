package org.ali.strategy;

/**
 * Author: lury
 * Date: 2022-09-04 10:52
 */
public class Sorter<T> {

    public void sort(T[] arr,Comparator<T> comparator) {
        for (int i = 0;i < arr.length - 1;i++) {
            int minPos = i;

            for (int j = i + 1;j < arr.length;j++) {
                minPos = comparator.compare(arr[j],arr[i]) == -1 ? j : minPos;
            }

            swap(arr,i,minPos);
        }
    }

    void swap(T[] arr,int i,int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
