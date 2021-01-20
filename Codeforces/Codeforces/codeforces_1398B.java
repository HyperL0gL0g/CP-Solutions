
import java.util.PriorityQueue;
import java.util.Scanner;

public class codeforces_1398B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    int t= sc.nextInt();
    while(t-- > 0)
    {
        String s=sc.next();
        PriorityQueue<String> pq  =  new PriorityQueue<>((a,b)->b.length()-a.length());
        for(String str : s.split("0"))
        {
            pq.add(str);
        }
        int alice=0;
        while(!pq.isEmpty())
        {
            alice+=pq.poll().length();
            if(!pq.isEmpty())
                pq.poll();
        }
        System.out.println(alice);
    }
    }
}
