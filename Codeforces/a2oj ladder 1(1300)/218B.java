import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc  = new Scanner(System.in);
    int people = sc.nextInt();
    int planes = sc.nextInt();
    Queue<Integer> min  = new PriorityQueue<>();
    Queue<Integer> max  = new PriorityQueue<>((a,b)->b-a);
    for(int i=0;i<planes;i++)
    {
        int a =sc.nextInt();
        min.add(a);
        max.add(a);
    }
    int mini=0,maxi=0;
    for(int i=0;i<people;i++)
    {
        int k=min.poll();
        mini+=k;
        if(k!=1)
        {
            k-=1;
            min.add(k);
            
        }
        int j=max.poll();
        maxi+=j;
        if(j!=1)
        {
            j-=1;
            max.add(j);
        }
    }
    System.out.println(maxi+" "+mini);
    
    }
}
    
    