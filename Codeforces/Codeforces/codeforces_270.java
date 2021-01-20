//unchecked
import java.util.Scanner;

public class codeforces_270 {
    public static void  main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            int m= sc.nextInt();
            if(m==60||m==90||m==108||m==120)
            {
                System.out.println("YES");
            }
        else
            {
                System.out.println("NO");
            }
            n--;
        }
    }
}
