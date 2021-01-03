import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc= new Scanner(System.in);
   long n  = sc.nextLong();
  int count=0;
   while(n>0)
   {
       long rem = n%10;
       if(rem==7 || rem==4)
       count++;
       n=n/10;
   }
   
      //     System.out.println(count);
   String s = count+"";
   for(char c  : s.toCharArray())
   {
       
          // System.out.println(c);
       if(c!='4' && c!='7')
       {
           System.out.println("NO");
           return;
       }
   }
   System.out.println("YES");
    }
}