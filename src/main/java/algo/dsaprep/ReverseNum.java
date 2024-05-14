package algo.dsaprep;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int reverseNum = 0;
        int dummyNum = num;
        while (dummyNum > 0) {
            int remainder = dummyNum % 10;
            dummyNum = dummyNum / 10;
            reverseNum = remainder + (reverseNum * 10);
        }
        System.out.println(reverseNum);
    }
}
