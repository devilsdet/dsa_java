package lc.dplc;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths62 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        Map<String, Integer> hashmap = new HashMap<>();

        System.out.println(uniquePathsRec(m, n));
        System.out.println(uniquePathsMem(m, n, hashmap));
        System.out.println(uniquePathsTab(m, n));
    }

    private static int uniquePathsTab(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        dp[1][1] = 1;
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(i !=1 || j != 1) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }

    private static int uniquePathsMem(int m, int n, Map<String, Integer> hashmap) {
        if( m == 0 || n == 0) {
            return 0;
        }
        if( m==1 && n==1 ) {
            return 1;
        }
        String key = m + "," + n;

        if(hashmap.containsKey(key)) {
            return hashmap.get(key);
        }

        hashmap.put(key, uniquePathsMem(m-1, n, hashmap) + uniquePathsMem(m, n-1, hashmap));
        return hashmap.get(key);
    }

    private static int uniquePathsRec(int m, int n) {
        if(m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n==1 ) {
            return 1;
        }
        return uniquePathsRec(m-1, n) + uniquePathsRec(m, n-1);
    }
}
