package dsa_java.practice;

public class TriangularNumberBf_01 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findTriangularNumber(n));

    }

    private static int findTriangularNumber(int n) {
        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum +=i;
        }
        return sum;
    }
}
