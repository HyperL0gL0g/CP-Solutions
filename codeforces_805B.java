import java.util.Scanner;

public class codeforces_805B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int j=1;
        for(int i=1;i<=n;i++)
        {
            if(j<=2)
                System.out.print("a");
            else
                System.out.print("b");
            j++;
            if(j>4)
                j=1;
        }
    }
}
