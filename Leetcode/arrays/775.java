class Solution {
    public boolean isIdealPermutation(int[] A) {
        int local=0,global=0;
        
      /*  for(int i=0;i<A.length-1;i++)
        {
            if(A[i]>A[i+1])
                local++;
        }*/
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    if(j-i==1)
                        local++;
                    global++;
                }
            }
        }
        return local==global;
    }
}