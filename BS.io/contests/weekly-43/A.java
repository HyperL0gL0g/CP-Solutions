import java.util.HashSet;

public class A {
   // import java.util.*;

    class Solution {
        public int solve(String[][] contacts) {
            int men=0;
            HashSet<String> set = new HashSet<>();
            for(String[] i : contacts)
            {
                boolean flag=true;
                for(String s : i)
                {
                    if(!set.add(s))
                    {
                        flag=false;
                    }
                }
                if(flag)
                    men++;
            }
            return men;

        }
    }
}
