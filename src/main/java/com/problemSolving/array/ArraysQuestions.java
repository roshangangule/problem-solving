package com.problemSolving.array;

import java.util.*;

public class ArraysQuestions {

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,2,3,4};
        int ans = findUniqueElement(arr);
        System.out.println("Unique element is::: "+ans);

        int [] arr1 = {1,2,2,1,1,3};
        boolean uniqueNumOcc = uniqueOccurrences(arr1);
        System.out.println("Output:: "+uniqueNumOcc);

        int [] arr2 = {5,1,2,3,4,2};
        int answer = 0;
        for (int i = 0; i < arr2.length; i++) {
            answer = answer ^ arr2[i];
        }
        System.out.println(answer);
        for (int i = 1; i < arr2.length; i++) {
            answer = answer ^ i;
        }
        System.out.println(answer);
    }

    private static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occ = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (occ.containsKey(arr[i])) {
                occ.put(arr[i], occ.get(arr[i]) + 1);
            } else {
                occ.put(arr[i], 1);
            }
        }
        boolean ans = true;
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> e: occ.entrySet()) {
            if (!set.add(e.getValue())) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    private static int findUniqueElement(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
