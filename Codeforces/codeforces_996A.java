import java.util.Scanner;

public class codeforces_996A {
    public static void p(Object o)
    {
        System.out.println(o);
    }

    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
p(n/100+(n%100)/20+(n%20)/10+(n%10)/5+(n%5)/1);

    }
}
