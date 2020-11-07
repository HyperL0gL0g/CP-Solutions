import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class codeforces_1407A {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int  n =sc.nextInt();
            List<Integer> l = new ArrayList<>();
            int odd = 0,even=0;
            for(int i=1;i<=n;i++){
                int a=sc.nextInt();
                l.add(a);
                if(i%2==0)
                    even+=a;
                else
                    odd+=a;
            }
                if(odd==even)
                {
                    P(l);
                    continue;
                }
              //  int rem=0;
                int diff=0;
                int i=1;
            Iterator itr = l.iterator();
                if(odd > even)
                {
                     diff=odd-even;

                     i=1;
                    while (itr.hasNext() && diff!=0)
                    {
                        int x = (Integer)itr.next();
                        if ( i%2!=0 && x==1) {
                            itr.remove();
                          //  rem++;
                            diff--;
                        }
                        i++;
                    }
                    P(l);
                }
            if(even > odd) {
                diff = even - odd;
                i = 1;
                while (itr.hasNext() && diff != 0) {
                    int x = (Integer) itr.next();
                    if (i % 2 == 0 && x == 1) {
                        itr.remove();
                        diff--;
                    }
                    i++;
                }
                P(l);
            }}}

    private static void P(List<Integer> l) {
        System.out.println(l.size());
        for(int i   : l )
            System.out.print(i+" ");
        System.out.println();
    }


}

