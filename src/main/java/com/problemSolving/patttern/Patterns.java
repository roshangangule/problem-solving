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
        rectTriangleNumberPattern(4);
        System.out.println();
        rectTriangleNumberRevPattern(4);
        System.out.println();
        letterPattern(4);
        System.out.println();
        letterIncrePattern(4);
        System.out.println();
        letterRepPattern(4);
        System.out.println();
        letterTrianglePattern(4);
        System.out.println();
        letterTriangleIncrePattern(4);
        System.out.println();
        letterTriangleDecrePattern(4);
        System.out.println();
        triangleincrePattern(4);
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
    private static void rectTriangleNumberPattern(int number) {

        for ( int i = 1; i <= number; i++) {
            //int count = i;
            for ( int j = 0; j < i; j++) {
                System.out.print(" "+(i+j));
                //System.out.print(" "+count);
                //count++;
            }
            System.out.println();
        }
    }
    private static void rectTriangleNumberRevPattern(int number) {

        for ( int i = 1; i <= number; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print(" "+(i-j));
            }
            System.out.println();
        }
    }
    private static void letterPattern(int number) {
        for ( int i = 1; i <= number; i++) {
            for ( int j = 1; j <= number; j++) {
                char ch = (char) ('A'+i-1);
                System.out.print(" "+ch);
            }
            System.out.println();
        }
    }
    private static void letterIncrePattern(int number) {
        int count = 0;
        for ( int i = 1; i <= number; i++) {
            for ( int j = 1; j <= number; j++) {
                char ch = (char) ('A'+count);
                System.out.print(" "+ch);
                count++;
            }
            System.out.println();
        }
    }
    private static void letterRepPattern(int number) {
        int count = 0;
        for ( int i = 1; i <= number; i++) {
            for ( int j = 0; j < number; j++) {
                char ch = (char) ('A'+i+j-1);
                System.out.print(" "+ch);
                count++;
            }
            System.out.println();
        }
    }
    private static void letterTrianglePattern(int number) {
        int count = 0;
        for ( int i = 0; i < number; i++) {
            for ( int j = 0; j <= i; j++) {
                char ch = (char) ('A'+i);
                System.out.print(" "+ch);
            }
            System.out.println();
        }
    }
    private static void letterTriangleIncrePattern(int number) {
        int count = 0;
        for ( int i = 0; i < number; i++) {
            for ( int j = 0; j <= i; j++) {
                char ch = (char) ('A'+i+j);
                System.out.print(" "+ch);
            }
            System.out.println();
        }
    }
    private static void letterTriangleDecrePattern(int number) {
        int count = 0;
        for ( int i = 1; i <= number; i++) {
            for ( int j = i; j >= 1; j--) {
                char ch = (char) ('A'+number-j);
                System.out.print(" "+ch);
            }
            System.out.println();
        }
    }
    private static void triangleincrePattern(int number) {
        for ( int i = 1; i <= number; i++) {
            int space = number - i;
            while(space >= 1) {
                System.out.print(" ");
                space --;
            }
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
