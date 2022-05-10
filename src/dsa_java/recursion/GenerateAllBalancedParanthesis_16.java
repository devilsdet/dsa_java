package dsa_java.recursion;

public class GenerateAllBalancedParanthesis_16 {
    public static void main(String[] args) {
        int n = 3;
        int open = n;
        int close = n;
        String op="";

        solve(open, close, op);
    }

    private static void solve(int open, int close, String op) {
        if(open == 0 && close == 0) {
            System.out.println(op);
            return;
        }

        if(open != 0) {
            String op1 = op + "(";
            solve(open-1, close, op1);
        }

        if(close > open) {
            String op2 = op + ")";
            solve(open, close-1, op2);
        }
    }
}
