package com.problemSolving.array;


public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {10,2,3,4,5,23};
        int[] reverseArray = reverseArray(arr);
        printArray(reverseArray);
        int arr1[] = {10,2,3,4,23};
        int[] swapAlternativeArray = swapAlternativeArray(arr1);
        System.out.println("\nSwap Alternative element");
        printArray(swapAlternativeArray);
        swapAlternativeArray = swapAlternativeArray2(arr1);
        System.out.println("\nSwap Alternative element");
        printArray(swapAlternativeArray);

    }

    private static int[] swapAlternativeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int end = i+1;
            if ((end < arr.length) && (start < arr.length)) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                i++;
            }
        }
        return arr;
    }
    private static int[] swapAlternativeArray2(int[] arr) {
        for (int i = 0; i < arr.length; i = i+2) {
            int j = i+1;
            if (j < arr.length) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[i] = temp;
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    private static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while ( start < end ) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
