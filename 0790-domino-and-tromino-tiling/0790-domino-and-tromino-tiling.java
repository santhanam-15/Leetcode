class Solution {
    int[] dp;
    int MOD = 1_000_000_007;
    public int numTilings(int n) {
        dp=new int[n+1];
        if(n<=2){
            return n==0 ? 0 : n;
        }

        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (int) ((2L * dp[i - 1] + dp[i - 3]) % MOD);
        }
        return dp[n];
    }
}