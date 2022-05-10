package dsa_java.recursion;

public class LetterCasePermutation_14 {
    public static void main(String[] args) {
        String str = "a1b2";
        String op = "";
        printAllCasePermutation(str,op);
    }

    private static void printAllCasePermutation(String ip, String op) {
        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }

        if(Character.isAlphabetic(ip.charAt(0))) {
            String op1 = op + ip.charAt(0);
            String op2 = op + Character.toUpperCase(ip.charAt(0));
            ip =ip.substring(1);
            printAllCasePermutation(ip, op1);
            printAllCasePermutation(ip, op2);
            return;
        } else {
            String op1 = op + ip.charAt(0);
            ip =ip.substring(1);
            printAllCasePermutation(ip, op1);
            return;
        }

    }
}
