// Last updated: 9/15/2025, 8:40:02 PM
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;  // Empty tree
        dp[1] = 1;  // One node
        
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        
        return dp[n];
    }
}
