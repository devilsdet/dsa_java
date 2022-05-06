package dsa_java.recursion;

public class TriangularNumber_07 {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(findTriangularUsingRecur(n));
    }

    private static int findTriangularUsingRecur(int n) {
        if(n==1) {
            return 1;
        }
        return n + findTriangularUsingRecur(n-1);
    }
}
