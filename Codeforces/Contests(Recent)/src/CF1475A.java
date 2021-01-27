import java.util.*;

public class CF1475A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       outer: while(t-- > 0)
        {
            long n =sc.nextLong();
            if(n%2!=0)
            {
                System.out.println("Yes");
                continue outer;
            }
            else
            {
                while(n>1)
                {
                    if(n%2!=0)
                    {
                        System.out.println("Yes");
                        continue outer;
                    }
                    else
                        n=n/2;
                }
                if(n==1)
                {
                    System.out.println("No");
                }
                else
                    System.out.println("YES");
            }
        }

    }
}
