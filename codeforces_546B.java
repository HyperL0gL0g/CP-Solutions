
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_546B     {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        Set<Integer> set= new HashSet<>();
            while(n-- >  0)
                {
                int curr=sc.nextInt();
                if(set.contains(curr))
                {
                   int num=curr;
                    while(set.contains(num))
                    {
                        num++;
                        ans++;

                    }
                    set.add(num);
                }
                else
                {
                    set.add(curr);
                }

                }


        System.out.println(ans);
    }
}