import java.util.Scanner;

public class codeforces_1327A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--  > 0)
        {
             long n= sc.nextInt();
             long k=sc.nextInt();
             if (n>=k*k  && n%2 == k%2)
            {
                System.out.println("YES");
            }
             else {
                 System.out.println("NO");
             }
        }
    }
}
