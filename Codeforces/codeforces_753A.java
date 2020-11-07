import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_753A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

/*
n=9
i-1 2 3.. 4
S-1 3 6.. 10
    3+(4-(1))
 */

int sum=0;
int i=0;
while(sum<=n)
{
    i++;
    sum+=i;
    if(sum<=n)
        l.add(i);

}
       /* System.out.println(l);
        System.out.println(sum);
        System.out.println(i);*/
        int last=l.get(l.size()-1);
        l.remove(l.size()-1);
        l.add(last+i-(sum-n));
        System.out.println(l.size());
        for(int j : l)
        System.out.print(j+" ");
    }
}