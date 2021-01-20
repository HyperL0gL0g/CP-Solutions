import java.util.Scanner;

public class codeforces_842A {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        long l,r,x,y,k;
        l=sc.nextLong();
        r=sc.nextLong();
        x=sc.nextLong();
        y=sc.nextLong();
        k=sc.nextLong();
        for(long i=x;i<=y;i++)
        {
            if(i*k>=l && i*k<=r)
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
