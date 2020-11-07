import java.util.Scanner;

public class codeforces_894A {
    public static void p(Object o)
    {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        String s=sc.next();
        int ans=0;

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                for(int k=j+1;k<s.length();k++)
                {
                    if(s.charAt(i)=='Q' && s.charAt(j)=='A' && s.charAt(k)=='Q')
                        ans++;
                }
            }
        }
        p(ans);
    }










}
