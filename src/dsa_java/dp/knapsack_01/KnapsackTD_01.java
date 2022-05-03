package dsa_java.dp.knapsack_01;

public class KnapsackTD_01 {
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = wt.length;
        int output = findMaxProfit(wt, val, W, n);
        System.out.println(output);
    }

    private static int findMaxProfit(int[] wt, int[] val, int W, int n) {
        int[][] t = new int[n+1][W+1];
        for(int i=0; i<W+1; i++) {
            t[0][i] = 0;
        }
        for(int j=0; j<n+1; j++) {
            t[j][0] = 0;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<W+1; j++) {
                if(wt[i-1] <= j) {
                    t[i][j] = Math.max((val[i-1] + t[i-1][j-wt[i-1]]), t[i-1][j]);
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][W];
    }
}
