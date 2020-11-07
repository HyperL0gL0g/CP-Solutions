import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class codeforces_988B {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        List<String> l = new ArrayList<>() ;

        while(n-- >  0)
        {
                l.add(sc.next()) ;
        }
       // l.forEach(i->System.out.println(i));
        Collections.sort(l,(a,b)->a.length()-b.length());
    //   l.forEach(i->System.out.println(i));

    for(int i=1;i<l.size();i++)
    {
        if(l.get(i).contains(l.get(i-1)))
            continue;
        else
        {
            System.out.println("NO");
            return;
        }
    }
        System.out.println("YES");
        l.forEach(i->System.out.println(i));







    }
}
