import java.util.Scanner;

public class codeforces_1374B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int t=sc.nextInt();
                while(t-- > 0) {
                    int n= sc.nextInt();
                    int two=0,three=0;
                    while(n%2==0)
                    {
                        n=n/2;
                        two++;
                    }
                    while(n%3==0)
                    {
                        n=n/3;
                        three++;
                    }
                    if(two>three || n!=1)
                    {
                        System.out.println("-1");
                        continue;
                    }
                    else
                        System.out.println(three-two+three);



                } }
}
