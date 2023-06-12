package com.problemSolving.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int reversedNumber = reverseInteger(1534236469);
        System.out.println("Reverse Number is::"+reversedNumber);
        int compliment = bitwiseCompliment(5);
        System.out.println("Compliment::"+compliment);
        boolean isPowerOfTwo = isPowerOfTwo(-16);
        System.out.println("Power of 2::"+isPowerOfTwo);

    }

    private static boolean isPowerOfTwo(int n) {
        int count = 0;
        int max_int = Integer.MAX_VALUE;
        int min_int = Integer.MIN_VALUE;
        if (n > 0 && n < max_int) {
            while (n != 0) {
                int bit = n & 1;
                if (bit == 1) {
                    count ++;
                }
                n = n >> 1;
            }
            if (count == 1) {
                return true;
            }
        }
        return false;
    }

    private static int bitwiseCompliment(int n) {
        int m = n;
        int mask = 0;
        if ( n == 0)
            return 1;
        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }
        int compliment = (~n) & mask;
        return compliment;
    }

    private static int reverseInteger(int number) {
        int min_num = Integer.MIN_VALUE;
        int max_num = Integer.MAX_VALUE;
        int ans = 0;
        while ( number != 0) {
            int digit = number % 10;
            if ((ans < min_num/10)|| (ans > max_num/10)) {
                return 0;
            }
            ans = (ans * 10) + digit;
            number = number / 10;
        }
        return ans;
    }
}
