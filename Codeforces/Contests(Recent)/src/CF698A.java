import java.util.HashMap;
import java.util.Scanner;

public class CF698A {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int n= sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            while(n-- >0) {
                int a =sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            int ans=0;
            for(int i :map.values())
            {
                ans=Math.max(ans,i);
            }
            System.out.println(ans);

        }

    }
}
