package com.problemSolving.decimalbinary;

public class DecimalBinary {
    public static void main(String[] args) {
        int ans = getBinaryNumber(1000);
        System.out.println(ans);
        int negativeNumber = getNegativeNumberBinary(-6);
    }

    private static int getNegativeNumberBinary(int i) {
        int n = Math.abs(i);
        int ans = 0;
        while ( n != 0) {
            int bit = n & 1;
            ans = (int) ((bit * Math.pow(10, i))+ ans);
            n = n >> 1;
            i++;
        }


        return 1;
    }

    private static int getBinaryNumber(int n) {
        int i = 0;
        int ans = 0;
        while ( n != 0) {
            int bit = n & 1;
            ans = (int) ((bit * Math.pow(10, i))+ ans);
            n = n >> 1;
            i++;
        }

        return ans;
    }
}
