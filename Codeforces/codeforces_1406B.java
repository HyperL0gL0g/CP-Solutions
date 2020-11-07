import java.util.*;
public class codeforces_1406B  {
    public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    int  t= sc.nextInt();
    while(t-- > 0)
    {
        int n =sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();

        Arrays.sort(arr);
        long ans=Long.MIN_VALUE;
       long c1=arr[0]*arr[1]*arr[n-1]*arr[n-2]*arr[n-3];
       ans=Math.max(ans,c1);
       long c2=arr[n-1]*arr[n-2]*arr[n-3]*arr[n-4]*arr[n-5];
        ans=Math.max(ans,c2);
        long c3 = arr[0]*arr[1]*arr[2]*arr[3]*arr[n-1];
        ans=Math.max(ans,c3);
        System.out.println(ans);
    }

    }
}
