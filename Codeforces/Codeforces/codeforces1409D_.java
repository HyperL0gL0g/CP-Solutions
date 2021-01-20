import java.util.Scanner;

public class codeforces1409D_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--  >  0)
        {
            long n=sc.nextLong();
            int s=sc.nextInt();
            long n2=n;
            long r=1;
            while(sum(n)>s)
            {
                    r*=10;
                    n=n/10;
                    ++n;
            }
        System.out.println((n*r)-n2);

        }
    }

    private static long sum(long n) {
        long sum=0;
        while(n>0)
        {
            long rem=n%10;
            sum+=rem;
            n=n/10;
        }
    return sum;
    }
}
