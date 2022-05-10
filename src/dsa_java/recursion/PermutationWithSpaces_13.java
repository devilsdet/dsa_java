package dsa_java.recursion;

public class PermutationWithSpaces_13 {
    public static void main(String[] args) {
        String ip = "ABCD";
        String op = "" + ip.charAt(0);
        ip = ip.substring(1);
        printAllPermutationWithSpace(op, ip);

    }

    private static void printAllPermutationWithSpace(String op, String ip) {
        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }
        String op1 = op + ip.charAt(0);
        String op2 = op + " " + ip.charAt(0);
        ip = ip.substring(1);
        printAllPermutationWithSpace(op1, ip);
        printAllPermutationWithSpace(op2, ip);
    }
}
