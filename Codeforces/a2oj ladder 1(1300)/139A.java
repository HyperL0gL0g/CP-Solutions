import java.util.*;

public class MyClass {
    public static void main(String args[]) {
    Scanner sc=  new Scanner(System.in);
    int n=sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    for(int i=0;i<7;i++)
    q.add(sc.nextInt());
     int i=0;
    while(n>0)
    {
        i++;
        if(i>7)
        i=1;
        int today = q.poll();
        n-=today;
        q.add(today);
        
    }
        System.out.println(i);
        
        
    }
}