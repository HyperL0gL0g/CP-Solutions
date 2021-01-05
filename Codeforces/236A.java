import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     String s=sc.next();
     HashSet<Character> set   = new HashSet<>();
     for(char c : s.toCharArray())
     set.add(c);
     int len = set.size();
     if(len%2!=0)
     {
         System.out.println("IGNORE HIM!");
     }
     else
     System.out.println("CHAT WITH HER!");
    }
}
    