import java.util.Arrays;
import java.util.Scanner;

public class codeforces_977C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        if(k>n || k==0)
        {
            System.out.println(-1);
            return;
        }
        
            int target=arr[k-1]+1;
            if( k!=n &&  arr[k]<=target)
            {
                System.out.println(-1);
                return;
            }

        System.out.println(target);




    }
}
