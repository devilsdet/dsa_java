package dsa_java.dp.knapsack_01;

public class LongestPalliandromicSubString_04 {
    public static void main(String[] args) {
        String str = "MADAMA";
        String ans = findLongestSubString(str);
        System.out.println(ans);
    }

    private static String findLongestSubString(String s) {
        int M= s.length(), N=M;
        boolean[][] dp = new boolean[M][N];
        int len=1, start=0;
        for(int i=0; i<M; i++){
            dp[i][i]=true;              //single character is a palindrome
            if(i+1 <M && s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;           //check 2 characters are palindrome or not
                len = 2;
                start=i;
            }
        }
        for(int k=3; k<=M; k++){           //then iterate from length 3 to length of tsring
            for(int i=0; i< M-k+1; i++){
                int j=i+k-1;
                //Madam(0,4) is palindrome <=> ada(1,3) is palindrome
                if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    dp[i][j]=true;
                    if(k>len){
                        len=k;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start+len);
    }
}
