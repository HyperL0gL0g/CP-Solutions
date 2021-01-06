import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
        
     Scanner sc = new Scanner(System.in);
     int n  =  sc.nextInt();
     int five=0,zero=0;
     for(int i=0;i<n;i++)
     {
         int a = sc.nextInt();
         if(a==0)
         zero++;
         else
         five++;
     }
     
   if(zero==0)
   System.out.println("-1");
   else if (five<9)
   System.out.println("0");
   else
   {
       five -= five%9;
       for(int i=0;i<five;i++)
       System.out.print("5");
       for(int i=0;i<zero;i++)
       System.out.print("0");
       
   }
   
     
    }
}
