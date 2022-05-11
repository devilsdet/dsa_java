package dsa_java.windowsliding;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSubstringInAString_09 {
    public static void main(String[] args) {
        String s = "FOXFOXOOOOOPPPPPPFOX";
        String t = "FOX";
        int count = countNumberOfSubString(s, t);
        System.out.println(count);
    }

    private static int countNumberOfSubString(String s, String t) {
        List<Character> tL = new ArrayList<>();
        for(char c: t.toCharArray()) {
            tL.add(c);
        }

        int i=0;
        int j=0;
        int count =0;
        List<Character> sL = new ArrayList<>();

        while (j < s.length()) {
            sL.add(s.charAt(j));
            if((j-i + 1) < t.length()) {
                j++;
            } else {
                if(sL.equals(tL)) {
                    count++;
                }
                sL.remove(0);
                i++;
                j++;
            }
        }
       return count;
    }
}
