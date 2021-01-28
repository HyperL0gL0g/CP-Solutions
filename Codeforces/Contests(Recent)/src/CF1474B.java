import java.util.Scanner;

public class CF1474B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int d = sc.nextInt();
            long a =1+d;
            a=next(a);
            long b = a+d;
            b=next(b);
            System.out.println(a*b);
        }
    }

    private static long next(long a) {
        boolean found =true;
        while(true) {
            found =true;
            for (int i = 2; i * i <= a; i++)
            {
                if (a % i == 0) {
                    found = false;
                    break;
                }
            }
                if(found)
                    break;
                else
                    a++;
            }
            return a;
        }

    }
