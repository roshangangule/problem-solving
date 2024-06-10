package algo.dsaprep;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSumProb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrLength = scan.nextInt();
        int sum = scan.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scan.nextInt();
        }
        String result = twoSum(arr, sum);
        System.out.println(result);
    }

    private static String twoSum(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (set.contains(temp)){
                return "Y";
            }
        }
        return "N";
    }
}
