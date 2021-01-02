import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- > 0)
        {
        
            int x=sc.nextInt();
           int ans=0;
           int jump=0;
           while(ans<x)
           {
               jump++;
               ans+=jump;
           }
           if(ans==x+1)
           {
               System.out.println(jump+1);
               
           }
           else
              System.out.println(jump);
        }
    }
}