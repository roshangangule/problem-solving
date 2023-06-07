package com.problemSolving.decimalbinary;

public class DecimalBinary {
    public static void main(String[] args) {
        int ans = getBinaryNumber(1000);
        System.out.println(ans);
        int negativeNumber = getNegativeNumberBinary(-6);
        System.out.println(negativeNumber);
        String result = getOddEvenNumber(10);
        System.out.println("the number is "+result);
        int reverse = getReverseOfNumber(123);
        System.out.println("the reverse number is "+reverse);

    }

    private static int getReverseOfNumber(int n) {
        int ans = 0;
        int i = 0;
        while( n != 0) {
            int digit = n % 10;
            ans =(int) (ans * 10) + digit;
            n = n / 10;
            i++;
        }
        return ans;
    }

    private static String getOddEvenNumber(int i) {
        int result = i & 1;
        if (result == 1) {
            return "odd";
        } else {
            return "even";
        }
    }

    private static int getNegativeNumberBinary(int number) {
        int n = Math.abs(number);
        int ans = 0;
        int i = 0;
        while ( n != 0) {
            int bit = n & 1;
            ans = (int) ((bit * Math.pow(10,i)) + ans);
            n = n >> 1;
            i++;
        }
        return ans;
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
