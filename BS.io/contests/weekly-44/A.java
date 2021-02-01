public class A {

    class Solution {
        public int solve(String s) {
            int ans=0;
            int curr=0;
            for(char c  : s.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    curr=curr*10 + Character.getNumericValue(c);
                }
                else{
                    ans+=curr;
                    curr=0;

                }
                //  System.out.println(curr);

            }
            if(curr!=0)
                ans+=curr;
            return ans;

        }
    }
}
