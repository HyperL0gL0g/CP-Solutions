import java.util.HashMap;
import java.util.Scanner;

public class codeforces_1374D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0 )
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr= new int[n];
            HashMap<Integer,Integer>  map    = new HashMap<>();
            int ans=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                arr[i] = arr[i]%k;
                map.put(k-arr[i],map.getOrDefault(k-arr[i],0)+1);
            }
            
        }
    }
}
