class Solution {
    public int maxProfit(int[] prices, int fee) {
         int n=prices.length;
        if(n<2)
            return 0;
        int flag = 2;
   
        int dp[][] =  new int[n][flag];
        
        for(int[]i :  dp)
                Arrays.fill(i,-1);
        
        return back(dp ,prices, 0,0,fee);
        
    }
    private int back(int[][] dp , int[] prices,  int flag, int index,int fee)
    {
        if(index>=prices.length )
            return 0;
        
        if(dp[index][flag]!=-1)
            return dp[index][flag];
        
        if(flag==1) //previously bought so now  i can sell or skip
        {
            dp[index][flag] =  Math.max(back(dp ,prices, 0, index+1,fee)+prices[index]-fee,back(dp ,prices, flag, index+1,fee));
        }
        else //previously sold so now can only buy/skip
            dp[index][flag]=  Math.max(back(dp ,prices, 1, index+1,fee)-prices[index],back(dp ,prices, flag, index+1,fee));
        
        return dp[index][flag];
    }
        
        
    }