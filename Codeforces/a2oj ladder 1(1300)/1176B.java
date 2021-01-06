import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            int[] arr = new int[3];
            while(n-- > 0)
            {
                int a =sc.nextInt();
                arr[a%3]++;
            }
            int ans=arr[0];
            int min =Math.min(arr[1],arr[2]);
            ans+=min;
            arr[1]-=min;
            arr[2]-=min;
            ans+=(arr[1]+arr[2])/3;
            
            System.out.println(ans);
        }

    }
}