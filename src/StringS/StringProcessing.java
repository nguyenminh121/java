package StringS;

import java.util.*;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        stringStandardization(s);
    }

    public static void stringStandardization(String S) {
        while (S.charAt(0) == ' ') {
            S = S.substring(1);
        }
        while (S.charAt(S.length() - 1) == ' ') {
            S = S.substring(0, S.length() - 1);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                sb.append(S.charAt(i));
            }
        }
        
        System.out.println(sb.toString());
    }
}
