import java.util.Scanner;

public class codeforces_219A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String s = sc.next();
        if(n==1)
        {
            System.out.println(s);
            return;
        }


            int[] chars = new int[26];
            for(char c: s.toCharArray())
                chars[c-'a']++;

            for(int i :  chars)
            {
                if(i%n!=0){
                    System.out.println(-1);
                    return;
                }
            }
            String ans="";
                for(int i=0;i<chars.length;i++)
                {
                    for(int j=0;j<chars[i]/n;j++)
                    {
                        ans+=(char)('a'+i);
                    }
                }

                for(int i=0;i<n;i++)
                {
                    System.out.print(ans);
                }

    }
}
