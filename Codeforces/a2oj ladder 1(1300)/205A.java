import java.util.*;

public class MyClass {
    public static void main(String args[]) {
    Scanner sc=  new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Integer,Integer> map = new HashMap<>();
    int min =Integer.MAX_VALUE;
     HashMap<Integer,Integer> city = new HashMap<>(); 

    for(int i=0;i<n;i++)
    {
        int a = sc.nextInt();
        city.put(i+1,a);
        map.put(a,map.getOrDefault(a,0)+1);
        min=Math.min(min,a);
    }
    if(map.get(min)>1)
    {
        System.out.println("Still Rozdil");
    }
    else
     {
         for(int i  : city.keySet())
         if(city.get(i)==min)
         System.out.println(i);
     }
    }
}