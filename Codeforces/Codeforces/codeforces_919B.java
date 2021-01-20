import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_919B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr=19;
       for(int i=0;i<=n;)
       {
           if(sum(curr)==10)
           {
               i++;

           }
           if(i==n)
               break;

           curr+=9;
       }
        System.out.println(curr);
    }

    private static int sum(int curr) {
        int sum=0;
        while(curr>0)
        {
            int rem=curr%10;
            sum+=rem;
            curr=curr/10;
        }
        //System.out.println(sum);
        return sum;
    }
}