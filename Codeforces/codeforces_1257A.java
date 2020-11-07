import java.util.Scanner;

public class codeforces_1257A
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            int x= sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int a= Math.min(A,B);
            int b =Math.max(A,B);
            int min=Math.min(x,a-1);
            a=a-min;
            x=x-min;
            if(x!=0)
            {
                min=Math.min(x,n-b);
                b+=min;
            }
            System.out.println(Math.abs(b-a)) ;
        }
    }
}
