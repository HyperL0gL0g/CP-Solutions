import java.util.Scanner;

public class codeforces_798A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int l=0,h=s.length()-1;
        int tot=0;
        while(l < h)
        {
            if(s.charAt(l)!=s.charAt(h))
            tot++;
            if(tot>1)
            {
                System.out.println("NO");
                return;
            }
            l++;
            h--;
        }
        if(tot==0 && s.length()%2==0)
        {
            System.out.println("NO");
            return;
        }
        else if(tot==0 && s.length()%2!=0)
        {

            System.out.println("YES");
            return;
        }

        System.out.println("YES");

    }
}
