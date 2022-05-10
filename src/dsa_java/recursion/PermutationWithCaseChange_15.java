package dsa_java.recursion;

public class PermutationWithCaseChange_15 {
    public static void main(String[] args) {
        String ip = "ab";
        String op = "";
        printCasePermutation(ip, op);
    }

    private static void printCasePermutation(String ip, String op) {
        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }
        String op1 = op + ip.charAt(0);
        String op2 = op + Character.toUpperCase(ip.charAt(0));
        ip = ip.substring(1);
        printCasePermutation(ip, op1);
        printCasePermutation(ip, op2);
    }
}
