import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_242B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        int n=sc.nextInt();
        int segment=1;
        int x1=0,x2=0;
        int minx=Integer.MAX_VALUE,maxx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {

        ArrayList<Integer>  l =  new ArrayList<>();
        x1=sc.nextInt();
        l.add(x1);
        minx=Math.min(minx,x1);

        x2=sc.nextInt();
            l.add(x2);
            maxx=Math.max(maxx,x2);
            map.put(segment,l);
            segment++;
        }

        for(int i :  map.keySet())
        {
            ArrayList<Integer> ll= map.get(i);
            if(ll.contains(maxx) && ll.contains(minx))
            {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
        return;










    }

}