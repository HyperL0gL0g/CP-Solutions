class Solution {
    
    public int minIncrementForUnique(int[] A) 
    {
     int[] count = new int[100000];
        for(int i : A)
            count[i]++;
        
        int ans=0,taken=0;
        for(int i=0;i<100000;i++)
        {
            if(count[i]>=2)
            {
                taken+=count[i]-1;
                ans-=i*(count[i]-1);
            }
            else if(taken > 0  && count[i]==0)
            {
                taken--;
                ans+=i;
            }
        }
        return ans;
        
        
        
        
    }
}