import java.util.Scanner;

public class codeforces_1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            if (b < a) {
                int temp = a;
                a = b;
                b = temp;
            }
            /*while(a!=b)
            {
                if(b-a>10)
                {
                    a+=10;
                    c++;
                }
                else
                {
                    a+=b-a;
                    c++;
                }*/

            c = (b - a) / 10;
            if((b-a)%10==0)
                c+=0;
            else
                c+=1;

            System.out.println(c);
        }

    }
    }

