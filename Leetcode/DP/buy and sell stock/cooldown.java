class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<2)
            return 0 ;
        //cannot buy/sell
        if(n==2)
            return Math.max(0,prices[1]-prices[0]);
        int[] buy =  new int[n];
        int[] sell =  new int[n];
        buy[0]=-prices[0];
        buy[1]=-Math.min(prices[0],prices[1]);//we buy the cheapest stock
        sell[1] =  Math.max(0,buy[0]+prices[1]);
        for(int i=2;i<n;i++)
        {
               
            buy[i] = Math.max(buy[i-1],sell[i-2] - prices[i]);
            sell[i] = Math.max(sell[i-1],buy[i-1]+prices[i]);
               
        }
        return sell[n-1];
    }
}