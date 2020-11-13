class Solution {
    public int getMaximumGenerated(int n) 
    {
    
    int[]  arr = new int[n+1];
    arr[0]=0;
        if(n==0)
            return arr[0];
    arr[1]=1;
        int max=0;
    for(int i=1;i<=n;i++)
    {
        int index= 2*i;
        if(index<=n)
        {
            arr[index]=arr[i];
        }
        int index2 = index+1;
        if(index2<=n)
            arr[index2] = arr[i] + arr[i+1];
        max=Math.max(max,arr[i]);
        
    }
  //  System.out.println(Arrays.toString(arr));
        
        
        return max;
    
    }
}
