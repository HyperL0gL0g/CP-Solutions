import java.util.Scanner;

public class codeforces_981A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        int l=0,h=s.length();

        while(l<h)
        {
            String str = s.substring(l,h);
            if(notpal(str))
            {
                System.out.println(str.length());
                System.exit(0);
            }
            String str2=s.substring(l+1,h);
            String str3=s.substring(l,h-1);
            System.out.println(str2);
            System.out.println(str3);
            if(notpal(str3)  || notpal(str2))
            {
                System.out.println(str2.length());
                System.exit(0);

            }
            l++;
            h--;
        }

        System.out.println("0");
    }

    private static boolean notpal(String str) {

        int l=0,h=str.length()-1;
        while(l<h)
        {
                    if(str.charAt(l)!=str.charAt(h))
                        return true;
       l++;
       h--;
        }
    return false;

    }
}
