import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc= new Scanner(System.in);
   String s =sc.next();
   int lower=0,upper=0;
   for(char c : s.toCharArray())
   {
       if(Character.isLowerCase(c))
       lower++;
       else
       upper++;
   }
   if(lower>=upper)
   System.out.println(s.toLowerCase());
   else
       System.out.println(s.toUpperCase());   
      
    }
}