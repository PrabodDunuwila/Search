package com.me.search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] searchArray1 = new int[]{1,4,2,6,7,94,3,4,6,4};
        int value1 = 7;
        LinearSearch linear = new LinearSearch();
        System.out.println("Linear search -> " + Arrays.toString(searchArray1) + " for value " + value1);
        System.out.println("index position: " + linear.doSearch(searchArray1, value1));

        int[] searchArray2 = new int[]{1,4,5,7,9,34,56,67,78,87};
        int value2 = 34;
        BinarySearch binary = new BinarySearch();
        System.out.println("Binary search -> " + Arrays.toString(searchArray2) + " for value " + value2);
        System.out.println("index position: " + binary.doSearch(searchArray2, value2));
    }
}
