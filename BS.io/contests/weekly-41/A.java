public class A {
  //  import java.util.*;

    class Solution {
        public boolean solve(int[] nums) {
            int n=nums.length;
            int l=-1,h=-1;
            for(int i=0;i<n;i++)
            {
                if(nums[i]==1)
                {
                    l=i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--)
            {
                if(nums[i]==1)
                {
                    h=i;
                    break;
                }
            }
            if(l==h)
                return true;
            for(int i=l;i<=h;i++)
            {
                if(nums[i]!=1)
                    return false;
            }
            return true;

        }
    }
}
