class Solution
{

    public boolean canFormArray(int[] arr, int[][] pieces)
    {
     int idx= 0 ;
        boolean state = false;
        for(idx = 0 ; idx<arr.length;)
        {
              state = false;
            int curr = arr[idx];
            for(int[] i   :  pieces)
            {
              
                if(i[0]==curr)
                {
                    for(int j   : i)
                    {
                        if(j!=curr)
                            return false;
                        state = true;
                        idx++;
                        if(idx<arr.length)                           // [1,3,5,7]
                                                                    //  [[2,4,6,8]]
                        curr=arr[idx];
                    }
                }
            }
            if(state == false)
                return false;
        }
        return true;
        
    }

}