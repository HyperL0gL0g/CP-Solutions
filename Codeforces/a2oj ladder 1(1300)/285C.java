import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n+1];
        arr[0]=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
       long ans=0;
       for(int i=1;i<=n;i++)
       {
           ans+=Math.abs(i-arr[i]);
       }
          System.out.println(ans);
    }
}