import java.util.Scanner;

public class codeforces_548A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();

        int k=sc.nextInt();
        if(k>s.length() || Math.ceil(s.length()*1.0/k)!=Math.floor(s.length()*1.0/k))
        {
            System.out.println("NO");
            return;
        }
        int count =0;
        int K=s.length()/k;
        for(int i =0;i<=s.length()-K;i+=K)
        {
            String  str= s.substring(i,i+K);
          //  System.out.println(str);

            if(ispal(str)) {
            count++;
                continue;

            }
            else
            {
                System.out.println("NO");
                return;
            }
        }
        if(count==k)
         //   System.out.println(count);
        System.out.println("YES");




    }
    private static boolean ispal(String s)
    {
        int l =0,h=s.length()-1;
        while(l<h)
        {
            if(s.charAt(l)!=s.charAt(h))
                return false;
            l++;
            h--;
        }
    return true;
    }

}
