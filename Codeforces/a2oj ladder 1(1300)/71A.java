import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     while(n-- > 0 )
     {
         String s =sc.next();
         int len  =s.length();
         if(len<=10)
         System.out.println(s);
         else
         help(len,s);
     }
    }
    private static void help(int length, String s)
    {
        System.out.println(s.charAt(0)+""+(length-2)+""+s.charAt(length-1));
    }
}
     