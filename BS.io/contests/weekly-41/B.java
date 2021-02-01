public class B {
  //  import java.util.*;

    class Solution {
        public int solve(String s, String t)
        {
            int diff=0;
            char[] arr1=  s.toCharArray();
            char[] arr2 = t.toCharArray();
            boolean[][] match  = new boolean[26][26];
            boolean[] a = new boolean[26];
            boolean[] b  = new boolean[26];
            for(int i=0;i<s.length();i++)
            {
                int chara=  arr1[i]-'a';
                int charb = arr2[i]-'a';
                if(chara!=charb)
                {
                    diff++;
                    match[chara][charb]  = true;
                    a[chara]=true;
                    b[charb]=true;
                }
            }
            if(diff==0)
                return 0;
            for(int i=0;i<26;i++)
            {
                for(int j=i+1;j<26;j++)
                {
                    if(match[i][j]==true &&  match[j][i])
                        return diff-2;
                }
            }

            for(int i=0;i<26;i++)
                if(a[i] && b[i])
                    return diff-1;

            return diff;



        }

    }
}
