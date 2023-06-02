package com.problemSolving.bitwise;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;

        System.out.println("a & b = "+ (a&b));
        System.out.println("a | b = "+ (a|b));
        System.out.println("~a = "+ (~a));
        System.out.println("a ^ b = "+ (a^b));


        System.out.println("17 << 1 = "+ (17 << 1));
        System.out.println("17 >> 1 = "+ (17 >> 1));

        printFibonacciSeries(10);
        isPrimeNumber(10);

        for (int i = 0; i <= 5; i++) {

            i++;
        }
    }

    public static void printFibonacciSeries(int number) {
        int start = 0;
        int end = 1;
        int sum = 0;
        System.out.println(start);
        System.out.println(end);

        for (int i = 0; i < number; i++) {
            sum = start + end;
            start = end;
            end = sum;
            System.out.println(sum);
        }
    }

    public static void isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }
    public int subtractProductAndSum(int n) {
        int[] arr = Integer.toString(n).chars().map(c -> c - '0').toArray();
        int product = 1;
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            sum = sum + arr[i];
            product = product * arr[i];
        }
        int result = product - sum;
        return result;
    }
}
