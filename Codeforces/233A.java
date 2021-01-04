import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     if(n%2==1)
     System.out.println("-1");
     else
     {
      for(int i=2;i<=n;i+=2)
      {
          System.out.print(i+" "+(i-1)+" ");
      }
     }
     
    }
}