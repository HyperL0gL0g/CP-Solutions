import java.util.Scanner;

public class codeforces_1398A {
    //a+b>c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long[] arr= new long[n];
            long a=0,b=0,c=0;
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            a= arr[0];
            b=arr[1];
            c=arr[arr.length-1];
           // System.out.println(a+" b "+" c" );
            if(a+b<=c)
            {
                System.out.println("1 "+"2 "+arr.length);
                continue;
            }
            else
            {
                System.out.println("-1");
                continue;
            }
        }
    }
}
