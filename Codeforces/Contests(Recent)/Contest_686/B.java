import java.util.HashMap;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] arr= new int[n+1];

            for(int i=1;i<=n;i++)
            {
                int a = sc.nextInt();
                arr[i]=a;
                map.put(arr[i],map.getOrDefault(a,0)+1);

            }
            int ans=-1;
            int min = n+2;
            for(int i=1;i<=n;i++)
            {
                if(map.get(arr[i])==1)
                {
                    if(arr[i]<min)
                    {
                        min = arr[i];
                        ans=i;
                        //break;
                    }
                }

            }
            System.out.println(ans);
        }
    }
}
