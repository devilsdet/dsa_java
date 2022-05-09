package dsa_java.newfeature.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

public class StringLengthCheckPredicate {
    public static void main(String[] args) {
       String[] s = {"Nag", "Chiranjeev", "Venkatsh", "Balaiah", "sunny" , "Katrina"};
       Predicate<String> st = sd -> sd.length() %2 ==0;
       for(String c: s) {
           System.out.print (st.test(c) + "  ");
       }
    }
}
