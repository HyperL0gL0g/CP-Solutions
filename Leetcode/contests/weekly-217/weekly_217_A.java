class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        
        for(int[]  i  : accounts)
        {
            int s=0;
         for(int j  : i)
             s+=j;
            max = Math.max(max,s);
        }
        return max;
        
    }
}