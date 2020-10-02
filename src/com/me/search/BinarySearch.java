package com.me.search;

public class BinarySearch {
    public int doSearch(int[] arr, int x) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == x) {
                return middleIndex;
            } else if (arr[middleIndex] < x) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > x)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }
}
