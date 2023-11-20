package com.problemSolving.binarysearch;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        int ans = missingNumber1(nums1);
        System.out.println(ans);
        int[] nums2 = {0,1};
        ans = missingNumber1(nums2);
        System.out.println(ans);
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        ans = missingNumber1(nums3);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        for (int i = 0; i <= size; i++) {
            boolean elementPresent = false;
            for (int j = 0; j < size; j++) {
               if (i == nums[j]) {
                    elementPresent = true;
                    break;
               }
           }
            if (!elementPresent)
                return i;
        }
        return 0;
    }
    public static int missingNumber1(int[] nums) {
        int size = nums.length;
        int sumOfElement = 0;
        int sumOfIndex = 0;
        for (int i = 0; i <= size; i++) {
            if (i < size)
                sumOfElement = sumOfElement + nums[i];
            sumOfIndex = sumOfIndex + i;
        }
        return sumOfIndex - sumOfElement ;
    }
}
