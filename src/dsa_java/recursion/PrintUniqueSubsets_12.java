package dsa_java.recursion;

import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueSubsets_12 {
    public static void main(String[] args) {
        String s = "aab";
        Set<String> set = recurSubset(s, "");
        System.out.println(set.toString());
    }

    private static Set<String> recurSubset(String ip, String op) {
        Set<String> output = new TreeSet<>();
        if(ip.length() == 0) {
            output.add(op);
            return output;
        }
        String output1 = op;
        String output2 = op + ip.charAt(0);
        ip = ip.substring(1);
        output.addAll(recurSubset(ip, output1));
        output.addAll(recurSubset(ip, output2));
        return output;

    }
}
