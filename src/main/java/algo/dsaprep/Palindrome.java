package algo.dsaprep;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String input = "aBcdba";
        int sp = 0;
        int ep = input.length()-1;
        boolean output = isPalindrome(input.toLowerCase(), sp, ep);
        System.out.println(output);
    }

    private static boolean isPalindrome(String input, int sp, int ep) {
        System.out.println(sp+" -" +ep);
        if (sp == ep)
            return true;
        if (sp > ep)
            return true;

        if (input.charAt(sp) == input.charAt(ep)){
            boolean t = isPalindrome(input, sp+1, ep-1);
            System.out.println(t);
            return t;
        } else {
            return false;
        }
    }
}
