package com.problemSolving.binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int mountain = peakIndexInMountainArray(arr);
        System.out.println(mountain);
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        int key = arr[mid];
        while(start <= end) {
            if (key < arr[mid + 1]) {

            } else if (key > arr[mid - 1]) {

            }
        }

        return -1;
    }
}
