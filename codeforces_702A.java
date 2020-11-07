

import java.util.Arrays;
import java.util.Scanner;

public class codeforces_702A {

public static void p(Object o) {
    System.out.println(o);
}

    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] dp =  new int[n];
        Arrays.fill(dp,1);
int max=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                dp[i]=dp[i-1]+1;
            }
            max=Math.max(max,dp[i]);
        }
       // p(Arrays.toString(dp));
        p(max);












}









}

