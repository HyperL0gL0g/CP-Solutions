import java.util.Scanner;

public class Hungry {
    public static void main(String[] args) {
        int a,n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        a=n+1;
         for(int i=1;i<=n;i++)
         {
             
             System.out.print(a+" ");
             a=a+1;
         }
    }
    
}