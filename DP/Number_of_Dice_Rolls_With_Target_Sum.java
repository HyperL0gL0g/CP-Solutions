class Solution {
    public int numRollsToTarget(int d, int f, int target) 
    {
        
        int mod =(int)(Math.pow(10,9)+7);
      long[][] dp  =  new long[d+1][target+1];
        
        dp[0][0]=1;
        
        for(int i=1;i<=d;i++)
        {
            for(int j=0;j<=target;j++)
            {
                for(int k=1;k<=j && k<=f;k++)
                {
                    dp[i][j]=(dp[i][j]+dp[i-1][j-k])%mod ;
                }
            }
        }
        
        return (int)dp[d][target];
    }
}
        
    