package com.problemSolving.binarysearch;

public class FirstLastOccurence {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,2,2,2};
        int key = 2;
        int firstOcc = firstOccurence(arr, key);
        System.out.println("first occurence of "+key+" is "+firstOcc);

        int lastOcc = lastOccurence(arr, key);
        System.out.println("last occurence of "+key+" is "+lastOcc);
    }

    private static int lastOccurence(int[] arr, int key) {
        int lastOcc = -1;
        int start = 0;
        int end = arr.length-1;

        int mid = start + (end-start)/2;
        while(start <= end) {
            if (key == arr[mid]) {
                lastOcc = mid;
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return lastOcc;
    }

    private static int firstOccurence(int[] arr, int key) {
        int firstOcc = -1;
        int start = 0;
        int end = arr.length-1;

        int mid = start + (end-start)/2;
        while(start <= end) {
            if (key == arr[mid]) {
                firstOcc = mid;
                end = mid - 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return firstOcc;
    }
}
