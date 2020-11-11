class Solution {
    List<String> ans  =  new ArrayList<>();
    
    public List<String> addOperators(String num, int target) 
    {
        if(num==null || num.length()==0)
            return ans;
        back(num,0,target,0,0,"");
        return ans;
    }
    private void back(String num , int start , int target,long eval ,long mul,String path)
    {
      if(start==num.length())
      {
          if(target==eval)
          ans.add(path);
          return ;
      }
        for(int i=start;i<num.length();i++)
        {
            if(i!=start && num.charAt(start)=='0')
                break;
            long cur = Long.parseLong(num.substring(start,i+1));
            if(start==0)
                back(num,i+1,target,cur,cur,path+cur);
            else
            {
            back(num,i+1,target,eval+cur,cur,path+"+"+cur);
                back(num,i+1,target,eval-cur,-cur,path+"-"+cur);
                back(num,i+1,target,eval-mul + cur*mul ,cur*mul,path+"*"+cur);
            }
            
        }
    }
}