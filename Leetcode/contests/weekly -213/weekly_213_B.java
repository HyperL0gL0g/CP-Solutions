class Solution {
    
    int ans =0 ; 
    public int countVowelStrings(int n) {
        
        char[] v = {'a','e','i','o','u'};
        
        back(v,n,new StringBuilder(),0);
        return ans;
    }
    private void back(char[] v , int n , StringBuilder sb , int start)
    {
        if(sb.length()==n)
        {
            ans++;
            return;
        }
        for(int i=start ;i<v.length;i++)
        {
            sb.append(v[i]);
            back(v,n,sb,i);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}