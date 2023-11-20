package com.problemSolving.binarysearch;

public class BinarySearchProb {
    public static void main(String[] args) {
        int even[] = {2,4,6,8,10,12};
        int index = findKey(even, 14, even.length);
        System.out.println("Element present at "+index);
    }

    private static int findKey(int[] arr, int key, int length) {
        int start = 0;
        int end = length-1;
        int mid = (start + end) / 2;

        while ( start <= end ) {
            if (key == arr[mid]) {
                return mid+1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
}
