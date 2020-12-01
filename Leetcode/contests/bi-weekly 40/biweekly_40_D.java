class Solution {
    public int minimumMountainRemovals(int[] nums) {
            
        int n = nums.length;
        int[] left = new int[n];
        int[] right  = new int[n];
        
        Arrays.fill(left,1);
        Arrays.fill(right,1);
            //left IS

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i] && left[i]<left[j]+1)
                {
                    left[i] =   left[j] + 1;
                }
            }
        }
         //right IS

        for(int i=n-2;i>=0;i--)
        {
            for(int j=n-1;j>i;j--)
            {
                if(nums[j]<nums[i] && right[i] < right[j]+1)
                    right[i]= right[j]+1;
                    
            }
        }
        //done with the Mountains
int max= 0;
        for(int i=1;i<n-1;i++)
        {
            if(left[i]>1 && right[i]>1)
            {
                max = Math.max(max  , left[i]+right[i]-1);
            }
        }
        return  n  -  max;
        
    }
}