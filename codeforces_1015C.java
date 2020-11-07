import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class codeforces_1015C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int capacity=sc.nextInt();
       List<Integer> original=new ArrayList<>();
        List<Integer> compressed = new ArrayList<>();
        List<Integer> diff   = new ArrayList<>();
        long     initsum=0;
        for(int i=0;i<n;i++)
        {
            original.add(sc.nextInt());
            compressed.add(sc.nextInt());
            initsum+=original.get(i);
            diff.add(original.get(i)-compressed.get(i));
        }

        //System.out.println(original);
        //System.out.println(compressed);
        //System.out.println(diff);
        if(initsum<=capacity)
        {
            System.out.println(0);
            return;
        }
        Collections.sort(diff,(a,b)->b-a);
int c=0;
        for(int i=0;i<diff.size();i++)
        {
            initsum-=diff.get(i);
            c++;
            if(initsum<=capacity)
            {
                System.out.println(c);
                return;
            }
        }
        System.out.println(-1);

    }

}
