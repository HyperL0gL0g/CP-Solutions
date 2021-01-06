import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     String s=  sc.next();
     String str = sc.next();
     if(s.compareToIgnoreCase(str) ==0)
     {
         System.out.println("0");
     }
    else if(s.compareToIgnoreCase(str)  <  0)
     {
         System.out.println("-1");
     }
     else
              System.out.println("1");
    }
}