//unchecked

import java.util.Scanner;

public class codeforces_466 {
    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,a,b;
        n=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(Math.min(n*a,(n/m)*b+Math.min((n%m)*a,b)));




    }
}
