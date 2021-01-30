import java.util.*;
public class C {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n  =sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // pick the longest range with smallest max number
        //O(n2)
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int curr  = arr[i];
            for(int j=i;j<n;j++)
            {
                curr=Math.min(arr[j],curr);
                ans =Math.max(ans,curr*(j-i+1));
            }
        }
        System.out.println(ans);


    }
}
