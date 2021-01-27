import java.util.Scanner;

public class CF1475B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer:
        while (t-- > 0) {
            int n = sc.nextInt();
            int rem = n%2020;
            int q =n/2020;
            if(rem<=q)
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }
}