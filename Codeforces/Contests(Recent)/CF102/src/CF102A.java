import java.util.*;
public class CF102A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >  0)
        {
            int n = sc.nextInt();
            int d=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int min1=arr[0];
            int min2=arr[1];
            int max=arr[n-1];
            if(max<=d)
            {
                System.out.println("YES");
                continue;
            }
            else if(min1+min2>d)
            {
                System.out.println("no");
                continue;
            }
            else
                System.out.println("yes");
        }
    }
}
