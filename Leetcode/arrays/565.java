class Solution {
    public int arrayNesting(int[] nums) {
        int n=nums.length;
        boolean[] seen = new boolean[n];
        int ans=0;
        
        for(int i : nums)
        {
            int c=0;
            while(!seen[i])
            {
                seen[i]=true;
                c++;
                i=nums[i];
            }
            ans=Math.max(ans,c);
        }
        return ans;
        
    }
}