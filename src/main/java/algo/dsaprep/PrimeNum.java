package algo.dsaprep;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int count = 0;
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                count ++;
            }
        }
        if (count >= 1) {
            System.out.println("not a prime");
        } else {
            System.out.println("prime");
        }
    }
}
