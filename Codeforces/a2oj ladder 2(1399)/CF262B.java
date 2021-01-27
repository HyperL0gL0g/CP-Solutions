import java.util.*;
public class CF262B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k  =sc.nextInt();
        long sum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
        pq.add(sc.nextInt());

        }
        while(k-- > 0 )
            pq.add(pq.poll()*-1);

        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        System.out.println(sum);

    }
}
