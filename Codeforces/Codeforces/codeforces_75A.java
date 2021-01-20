import java.util.Scanner;

public class codeforces_75A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long a = sc.nextLong(),b=sc.nextLong();

        long sum=Long.parseLong(((a+b)+"").replaceAll("0",""));

        long a2=Long.parseLong((a+"").replaceAll("0",""));
        long b2=Long.parseLong((b+"").replaceAll("0",""));

        long sum2=a2+b2;

       // System.out.println(sum);
       // System.out.println(sum2);
        if(sum==sum2)
        {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");




    }
}
