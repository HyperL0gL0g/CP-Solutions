public class C
{
    class Solution {
        public int solve(int[] nums) {
            if(nums.length<1)
                return 0;
            int max=1;
            // int M=Integer.MIN_VALUE,m=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++)
            {

                int M=nums[i];
                int m=nums[i];

                for(int j=i;j<nums.length;j++)
                {
                    m=Math.min(m,nums[j]);
                    M=Math.max(M,nums[j]);
                    if(M-m +1 == j-i+1)
                        max=Math.max(max,j-i+1);
                }
            }
            return max;
        }
    }
}
