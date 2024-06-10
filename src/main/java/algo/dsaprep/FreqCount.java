package algo.dsaprep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }
        int[] countOf = new int[m];
        for (int i = 0; i < m; i++) {
            countOf[i] = scan.nextInt();
        }

        getFreqCount(input, countOf);
    }
    public static void getFreqCount(int[] input, int[] countOf) {
        Map<Integer, Integer> freqCount = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int temp = freqCount.getOrDefault(input[i], 0);
            freqCount.put(input[i], temp+1);
        }
        for (int j = 0; j < countOf.length; j++) {
            System.out.print(freqCount.get(countOf[j])+" ");
        }

    }


}
