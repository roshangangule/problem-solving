package com.problemSolving.lec8;

import static java.lang.System.exit;

public class Notes {
    public static void main(String[] args) {
        getNotesFromAmount(1331);
        int ans = nCr(5,3);
        System.out.println("nCr - "+ans);
    }

    private static int nCr(int a, int b) {
        int num = factorial(a);
        int denom = factorial(b) * factorial(a-b);

        return num / denom;

    }

    private static int factorial(int a) {
        int ans = 1;
        for (int i = 1; i <= a; i++) {
            ans = ans * i;
        }
        return ans;
    }

    private static void getNotesFromAmount(int n) {
        int arr[] = {100,50,20,10,1};
        while (n != 0) {
            int result = 0;
            int notes = 0;
            for (int i = 0; i < arr.length;i++) {
                result = n / arr[i];
                if (result != 0) {
                    notes = arr[i];
                    n = n % arr[i];
                    break;
                }
            }
            switch (notes) {
                case 100:
                    System.out.println("100 - " + result);
                    break;
                case 50:
                    System.out.println("50 - " + result);
                    break;
                case 20:
                    System.out.println("20 - " + result);
                    break;
                case 10:
                    System.out.println("10 - " + result);
                    break;
                case 1:
                    System.out.println("1 - " + result);
                    break;
                default:
                    System.out.println("Note not available!");
            }
        }
    }
}
