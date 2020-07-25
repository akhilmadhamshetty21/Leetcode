class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int memo[][] = new int[m + 1][n + 1];
        char[] X=text1.toCharArray();
        char[] Y=text2.toCharArray();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    memo[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                else
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
            }
        }
        return memo[m][n];
​
    }
​
}
