class Solution {
    public int countVowelStrings(int n) {
         char[] arr = {'a','e','i','o','u'};
        List<String> l = new ArrayList<>();
        back(l,arr,n,new StringBuilder(),0);
       // System.out.println(l);
        return l.size();
    }
    private void back(List<String> l  , char[] arr ,int n,StringBuilder s, int start)
    {
        if(n==0)
        {
            l.add(s.toString());
            return ;
        }
        for(int i=start;i<arr.length;i++)
        {
		//choose
            s.append(arr[i]);
			/explore
            back(l,arr,n-1,s,i);
			//unchoose
            s.deleteCharAt(s.length()-1);
        }
    }
}

OR

class Solution {
    int ans=0;
    public int countVowelStrings(int n) {
        char[] arr= {'a','e','i','o','u'};
        
        back(arr, 0 , n);
       
            return ans;
    }
    private void back(char[] arr , int  start, int n)
    {  
        if(n==0)
        {
            ans++;
            return;
        }
        
        for(int i=start ; i<arr.length;i++)
        {     
		//for each character explore all other lexicographically viable solutions
                back(arr,i,n-1);   
        }
        
    }
}