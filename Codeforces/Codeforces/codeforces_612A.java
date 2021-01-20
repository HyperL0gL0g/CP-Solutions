import java.util.Scanner;

public class codeforces_612A {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),p=sc.nextInt(),q=sc.nextInt();
        String s= sc.next();

        if(p+q==n)
        {
          System.out.println(s.substring(0,p));
          System.out.println(s.substring(p,n));
          return ;
        }
        if(2*p==n)
        {

        }
        if(2*q==n)
        {

        }

    }
}
