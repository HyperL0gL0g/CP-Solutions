import  java.util.*;
public class CF1472B
{
    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            int[] arr = new int[n];
            int ones=0,twos=0;
            for(int i=0;i<n;i++)
            {
                int a =sc.nextInt();
                if(a==1)
                    ones++;
                else
                    twos++;
            }
            if(ones%2!=0 || (n%2!=0 && ones==0))
            {
                System.out.println("NO");
            }
            else

                    System.out.println("yes");
        }

    }
}
/*
1 1 1 1 2 2
 */