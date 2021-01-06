import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int ans=0;
     while(n-- > 0)
     {
         String s = sc.next();
         if(s.contains("+"))
         ans++;
         else if(s.contains("-"))
         ans--;
     }
     System.out.println(ans);
     
    }
}