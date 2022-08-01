package leetcode.dynamic_programming;
/*
* <a href="https://leetcode.com/problems/longest-palindromic-substring/">Longest Palindromic Substring</a>
*
*/
public class LongestPalliandromicSubString {
    public static void main(String[] args) {
        String str = "babbad";
        System.out.println(findLongestPalliandromicSubString(str));
    }

    private static String findLongestPalliandromicSubString(String str) {
        int lengthStr = str.length();
        boolean[][] dp = new boolean[lengthStr][lengthStr];
        int start = 0;
        int end = 0;

        for(int g=0; g<dp.length; g++) {
            for(int i=0, j=g; j<lengthStr; j++, i++) {
                boolean charExtremeMatch = str.charAt(i) == str.charAt(j);
                if(g==0) {
                    dp[i][j] = true;
                } else if (g==1) {
                    if(charExtremeMatch) {
                        dp[i][j] = true;
                        start = i;
                        end = j;
                    }
                } else {
                    if(charExtremeMatch && dp[i+1][j-1]) {
                      dp[i][j] = true;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return str.substring(start, end+1);
    }
}
