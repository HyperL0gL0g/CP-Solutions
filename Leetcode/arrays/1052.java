class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int normal=0,grumpyW=0,maxG=0;
        for(int i=0;i<grumpy.length;i++)
        {
            if(grumpy[i]==0)
                normal+=customers[i];
            if(grumpy[i]==1)
                grumpyW+=customers[i];
            if(i-X>=0)
            {
                if(grumpy[i-X]==1)
                    grumpyW-=customers[i-X];
            }
            maxG=Math.max(maxG,grumpyW);
        }
        return maxG+normal;
        
    }
}