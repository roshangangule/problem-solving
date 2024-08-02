package algo.dsaprep;

public class Countaaa {
    public static void main(String[] args) {
        String input = "aaaaaa";
        int sp = 0;
        int ep = 3;
        int c = 0;
        int count = countAllAaa(input, sp, ep);
        System.out.println(count);
        count = countAaa(input, sp, ep);
        System.out.println(count);
    }

    private static int countAllAaa(String input, int sp, int ep) {
        System.out.println(sp+" - "+ep);
        if (ep > input.length()) {
            return 0;
        }
        String patt = input.substring(sp,ep);
        if (patt.equalsIgnoreCase("aaa")) {
            int temp = countAllAaa(input, sp + 1, ep + 1);
            return temp+1;
        } else {
            int temp = countAllAaa(input, sp + 1, ep + 1);
            return temp;
        }
    }
    private static int countAaa(String input, int sp, int ep) {
        System.out.println(sp+" - "+ep);
        if (ep > input.length()) {
            return 0;
        }
        String patt = input.substring(sp,ep);
        if (patt.equalsIgnoreCase("aaa")) {
            int temp = countAaa(input, sp = ep, ep + 3);
            return temp+1;
        } else {
            int temp = countAaa(input, sp + 1, ep + 1);
            return temp;
        }
    }
}
