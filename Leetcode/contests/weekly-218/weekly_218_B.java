class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0  ; 
        for(int i=0;i<nums.length;i++)
        {
            int curr = nums[i];
            if(curr>=k || curr==-1)
                continue;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==k-curr && nums[j]!=-1)
                {
                    ans++;
                    nums[i]  =-1;
                    nums[j]= -1;
                    break;
                }
            }
        }
        return ans;
        
    }
}