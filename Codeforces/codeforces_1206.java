import java.util.Scanner;

public class codeforces_1206 {
    public static void p(Object o)
    {
        System.out.println(o);
    }

    public static void main(String[] args) {

            Scanner sc=  new Scanner(System.in);
            int n=sc.nextInt();
            long[] a = new long[n];
            long neg=0;
            long z=0;
            long coins=0;
            for(int i=0;i<n;i++) {
                a[i] = sc.nextLong();
                if (a[i] > 0) {
                    coins += a[i] - 1;

                } else if (a[i] < 0) {
                    coins += -1 - a[i];
                    neg++;
                } else
                    z++;
            }

if(z==0 && neg%2!=0)
    coins+=2;
else
    coins+=z;
p(coins);



        }
    }

