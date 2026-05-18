class Solution {
    int[] dp;
    int MOD = 1_000_000_007;
    public int numTilings(int n) {
        dp=new int[n+1];
        return rep(n);
    }
    int rep(int n){
        if (n==0){
            return 1;
        }
        if(n<=2){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        long res = (2L * rep(n - 1) + rep(n - 3)) % MOD; 
        dp[n]=(int)res;
        return dp[n];
    }
}