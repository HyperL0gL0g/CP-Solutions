import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     HashSet<Integer> set = new HashSet<>();
     set.add(sc.nextInt());
     set.add(sc.nextInt());
     set.add(sc.nextInt());
     set.add(sc.nextInt());
    System.out.println(4-set.size());
    }
}
     