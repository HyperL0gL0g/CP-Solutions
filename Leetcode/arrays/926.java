class Solution {
    public int minFlipsMonoIncr(String S) {
        int ones=0,flip=0;
        char[] arr= S.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
            {
                if(ones==0)
                    continue;
                else
                {
                    flip++;
                }
            }
            else
                ones++;
            
            if(flip > ones)
            {
                flip=ones;
            }
        }
        return flip;
        
    }
}