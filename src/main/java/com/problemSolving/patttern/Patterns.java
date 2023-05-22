package com.problemSolving.patttern;

public class Patterns {


    public static void main(String[] args) {
        numberPattern(4);
        System.out.println();
        numberPatternWithIncrementFashion(4);
        System.out.println();
        trianglePattern(4);
        System.out.println();
        reverseTrianglePattern(10);
        System.out.println();
        triangleNumberPattern(4);
    }

    private static void numberPattern(int number) {
        for ( int i = 1; i <= number; i++) {
            for ( int j = 1; j <= number; j++) {
                //System.out.print(" "+(number-j+1)); // reverse order
                System.out.print(" "+(j));
            }
            System.out.println();
        }
    }
    private static void numberPatternWithIncrementFashion(int number) {
        int count = 1;
        for ( int i = 1; i <= number; i++) {
            for ( int j = 1; j <= number; j++) {
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
    }
    private static void trianglePattern(int number) {
        int count = 1;
        for ( int i = 1; i <= number; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void reverseTrianglePattern(int number) {
        for ( int i = 1; i <= number; i++) {
            int k = i;
            while (k > 1) {
                System.out.print(" ");
                k--;
            }
            for ( int j = i; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void triangleNumberPattern(int number) {
        int count = 1;
        for ( int i = 1; i <= number; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
