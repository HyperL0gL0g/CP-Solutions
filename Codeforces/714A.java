import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc =  new Scanner(System.in);
     
     long l1=sc.nextLong();
     long r1=sc.nextLong();
     long l2=sc.nextLong();
     long r2 =sc.nextLong();
     long k =sc.nextLong();
     if(l2>r1 || r2<l1)
     {
       System.out.println("0");
       return;
     }
     long start = l1>l2 ? l1 : l2;
     long end = r1<r2? r1 : r2;
       
     if(l2<=r1 || r2>=l1)
     {
       if(k>=start && k<=end)
     {
         System.out.println(end- start);
     }
     else
     {
         System.out.println(end - start +1);
     }
     
    
     }
    }
}
     
     
     
