package com.problemSolving.sortingAlgo;

public class BubbbleSort {
    public static void main(String[] args) {
        int []arr = {1,23,45,654,33,2};
        int[] sortedArray = getSortedArrayUsingBubbleSort(arr);
        System.out.print("Sorted Array:: ");
        for(int i : sortedArray) {
            System.out.print(" "+i);
        }
    }

    public static int[] getSortedArrayUsingBubbleSort(int[] array) {
        for (int i = 0; i < array.length-1;i++) {
            for (int j = i+1; j < array.length;j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
