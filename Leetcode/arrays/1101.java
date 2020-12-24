	class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int left=0,right=0;
     
        
        for(int i : weights)
        {
            left=Math.max(left,i);
            right+=i;
        }
        //binarysearch
        while(left<right)
        {
            int mid=  (left+right)/2;
            int days=1,curr=0;
            for(int i: weights)
            {
                if(curr+i >mid)
                {
                    curr=0;
                    days++;
                }
                curr+=i;
            }
            if(days>D)
                left=mid+1;
            else
                right=mid;
        }
        return left;
    }
}