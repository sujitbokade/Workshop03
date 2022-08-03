package com.bridgelabz.basics;

import java.lang.reflect.Array;

public class SortingNum {
    public static void main(String[] args) {
        int[] array = {99, 1, 55, 3, 43, 11, 89, 65};
        SortingNum sortingNum = new SortingNum();
        sortingNum.ascendingOrder(array);
        sortingNum.display(array);

    }
    public int[] ascendingOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}