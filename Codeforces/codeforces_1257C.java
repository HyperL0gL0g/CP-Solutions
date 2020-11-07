
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class codeforces_1257C {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            int[] arr= new int[n];

            HashMap<Integer, List<Integer>> listmap = new HashMap<>();

            for(int i=0;i<n;i++)
            {
                int a =sc.nextInt();
                if(listmap.containsKey(a))
                {
                    listmap.get(a).add(i);
                }
                else
                {
                   List<Integer> l = new ArrayList<>();
                   l.add(i);
                   listmap.put(a,l);
                }
            }
           int ans=Integer.MAX_VALUE;
            for(int i  :  listmap.keySet()) {
                if (listmap.get(i).size() > 1) {
                    List<Integer> curr = listmap.get(i);
                    for (int j = 0; j < curr.size(); j++) {
                        for (int k = j + 1; k < curr.size(); k++) {
                            int size = curr.get(k) - curr.get(j) +1;
                            if (size >= 2 && size < ans)
                                ans = size;
                        }
                    }
                }
            }
        if(ans==Integer.MAX_VALUE)
        {
            System.out.println("-1");
        }
        else
            System.out.println(ans);
        }

    }
}
