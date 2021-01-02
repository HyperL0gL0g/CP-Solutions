import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int t  = sc.nextInt();
     while(t-- > 0 )
     {
         int n=sc.nextInt();
         int a=0,b=0;
         int count=0;
         for(int i=2;i*i<=n;i++)
         {
             if(n%i==0 )
             {
                 if(a==0)
                 a=i;
                 else
                 b=i;
                 count++;
                 n=n/i;
                 if(count==2)
                 break;
             }
         }
         if(a!=0 && b!=0 && n>b)
         {
             System.out.println("YES");
                  System.out.println(a+" "+b+" "+n );
         }
         else
              System.out.println("NO");
             
     }
     
    }
}