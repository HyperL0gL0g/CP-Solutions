class Solution {
    public int maxScoreSightseeingPair(int[] A) 
    {
        int prev =0;
        int ans=A[0];
        
        for(int i=1;i<A.length;i++)
        {
            ans=Math.max(ans,A[prev]+prev+A[i]-i);
            if(A[prev]+prev<A[i]+i)
                prev=i;
        }
        return ans;
        
    }
}