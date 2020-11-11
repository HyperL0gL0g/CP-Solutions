//recursive

class Solution 
{
    int ans = 0; 
    public int findTargetSumWays(int[] nums, int S) 
    {
     back(nums,0,S,0);
        return ans;
    }
    private void back(int[] nums, int i , int target , int curr_sum)
    {
        if(i==nums.length)
        {
        if(curr_sum==target)
        {
                ans++;
          return ;
        }
            return;
        }
        back(nums,i+1,target,curr_sum+nums[i]);
        back(nums,i+1,target,curr_sum-nums[i]);
    }
}