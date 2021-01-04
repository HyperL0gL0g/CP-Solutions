import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     int[] exit= new int[n];
     int[] geton  = new int[n];
     
     for(int i=0;i<n;i++)
     {
         exit[i]=sc.nextInt();
         geton[i] = sc.nextInt();
     }
     int cur=0;int max=0;
     for(int i=0;i<n;i++)
     {
         cur-=exit[i];
         cur+=geton[i];
       //  System.out.println(cur);
         max=Math.max(max,cur);
     }
     System.out.println(max);
    }
}