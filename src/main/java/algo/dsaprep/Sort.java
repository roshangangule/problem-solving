package algo.dsaprep;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sp = 0;
        int ep = 1;
        boolean ans = sortedArray(arr, sp, ep);
        System.out.println(ans);

    }
    public static boolean sortedArray(int[] arr, int sp, int ep) {
        if (sp < ep && ep > arr.length-1) {
            return true;
        }
        System.out.println(sp+" "+ep);
        boolean check = sortedArray(arr, sp+1, ep+1);
        if (arr[sp] <= arr[ep]) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }
}
