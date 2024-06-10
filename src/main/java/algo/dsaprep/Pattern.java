package algo.dsaprep;

import java.util.concurrent.ScheduledFuture;

public class Pattern {
    public static void main(String[] args) {
        int  n = 5;
        int nst = 1;
        int nsp = n/2;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print(count);
                if (count > nst) {
                    count --;
                } else {
                    count++;
                }
            }
            if (i <= n/2) {
                nst = nst + 2;
                nsp = nsp - 1;
            } else {
                nst = nst - 2;
                nsp = nsp + 1;
            }
            System.out.println();
        }
    }


}
