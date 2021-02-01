import java.util.HashMap;

public class B
{
   /* class Solution {
        static HashMap<Integer,Integer> map;
        public int[] solve(String s) {
            map  =  new HashMap<>();
            rec(0,-1,s);
            int[] ans = new int[map.size()-1];
            for(int i=0;i<map.size()-1;i++)
                ans[i]=map.get(i);
            return ans;
        }
        private static void rec(int index , int depth,String s)
        {
            if(index>=s.length())
                return ;
            if(!map.containsKey(depth))
                map.put(depth,0);
            char c= s.charAt(index);
            if(c=='(')
                rec(index+1,depth+1,s);
            if(c==')')
                rec(index+1,depth-1,s);
            if(c=='X')
            {
                map.put(depth,map.get(depth)+1);
                rec(index+1,depth,s);
            }
        }

    }*/
}

