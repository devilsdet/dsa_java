package dsa_java.recursion;

public class Factorial_08 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactroial(n));
    }

    private static int findFactroial(int n) {
        if(n==1) {
            return 1;
        }
        return n * findFactroial(n-1);
    }
}
