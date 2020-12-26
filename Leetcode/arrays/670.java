class Solution {
    public int maximumSwap(int num) {
        
        char[] arr= (num+"").toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            int max=arr[i]-'0';
            int index=-1;
            for(int j=arr.length-1;j>i;j--)
            {
          
                int b= arr[j]-'0';
                if(b>max)
                {
                max=b;
                index=j;
                    
                }
            }
          //  System.out.println(arr[i]+" "+max);
            if(max>arr[i]-'0')
            {
                System.out.println("!");
             int t=arr[i]-'0';
                arr[i]=arr[index];
                arr[index]=(char)(t+ '0');
                return Integer.parseInt(new String(arr));
            }
        }
        return num;
        
    }
}