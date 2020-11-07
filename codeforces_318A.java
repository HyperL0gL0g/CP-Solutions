import java.util.Scanner;

public class codeforces_318A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long n= sc.nextLong();
        long k=sc.nextLong();


            //even==odd
            long mid =n/2;
           if(n%2==1)
           {
               mid++;

           }
           if(k<=mid)
           {
               System.out.println(2*k-1);
              // System.exit(0);
           }
           else
               System.out.println((k-mid)*2);
        }
    }

