import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     String a=sc.next();
     String b=sc.next();
     String cc=sc.next();
     //a+b==c
     int[] arr =new int[26];
     for(char c: a.toCharArray())
     arr[c-'A']++;
      for(char c: b.toCharArray())
     arr[c-'A']++;
      for(char c: cc.toCharArray())
     arr[c-'A']--;
     
     for(int i : arr)
     {
         if(i!=0)
         {
             System.out.println("NO");
             return;
         }
     }
     System.out.println("YES");
    }
    
}