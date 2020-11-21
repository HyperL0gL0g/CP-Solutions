class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0)
        return new int[code.length];
        int[] arr= new int[code.length];
        int n = code.length;
        
     if(k>0)
     {
         for(int i=0;i<code.length;i++)
         {
             
             int K=k;
             int j=(i+1)%arr.length;
             int s=0;
             while(K-- > 0)
             {
                // System.out.println(i+" "+j);
                 s+=(code[j%arr.length]);
                 j=((j+1)%arr.length);
             }
         //    System.out.println(s);
             arr[i]=s;
         }
     }
       if(k<0)
        {
            
         for(int i=0;i<code.length;i++)
         {
             int K= -k;
             int j=(i+n+k)%arr.length;
            // System.out.println(j);
             int s=0;
             while(K-- > 0)
             {
              //   System.out.println(i+" "+j);
                 s+=(code[j%arr.length]);
                 j=((j+1)%arr.length);
             }
         //    System.out.println(s);
             arr[i]=s;
         }
        
       }
        
        return arr;
        
    }
}