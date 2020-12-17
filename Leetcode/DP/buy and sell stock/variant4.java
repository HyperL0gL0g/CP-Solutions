class Solution {
    public int maxProfit(int k, int[] prices) {
        
 int n=prices.length;
        if(n<2)
            return 0;
        int flag = 2;
        int count =k;
        int dp[][][] =  new int[n][flag][count];
        
        for(int[][] i :  dp)
        {
            for(int[] j : i)
            {
                Arrays.fill(j,-1);
            }
        }
        
        return back(dp ,prices, 0,0,k-1);
        
    }
    private int back(int[][][] dp , int[] prices,  int flag, int index, int count)
    {
        if(index>=prices.length || count<0)
            return 0;
        
        if(dp[index][flag][count]!=-1)
            return dp[index][flag][count];
        
        if(flag==1) //previously bought so now  i can sell or skip
        {
            dp[index][flag][count] =  Math.max(back(dp ,prices, 0, index+1,count-1)+prices[index],back(dp ,prices, flag, index+1,count));
        }
        else //previously sold so now can only buy/skip
            dp[index][flag][count] =  Math.max(back(dp ,prices, 1, index+1,count)-prices[index],back(dp ,prices, flag, index+1,count));
        
        return dp[index][flag][count];
    }
}
