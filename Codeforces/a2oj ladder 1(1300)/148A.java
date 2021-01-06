import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int k= sc.nextInt();
      int l= sc.nextInt();
       int m= sc.nextInt();
        int n= sc.nextInt();
         int d= sc.nextInt();
         boolean[] arr  = new boolean[d+1];
         int mul=1;
         for(int i=k;i*mul<=d;)
         {
             
             arr[i*mul]=true;
             mul++;
         }
         mul=1;
         for(int i=l;i*mul<=d;)
         {
             
             arr[i*mul]=true;
             mul++;
         }
         mul=1;
         for(int i=m;i*mul<=d;)
         {
             
             arr[i*mul]=true;
             mul++;
         }
         mul=1;
         for(int i=n;i*mul<=d;)
         {
             
             arr[i*mul]=true;
             mul++;
         }
         int count=0;
         for(int i=1;i<=d;i++)
        if(arr[i]==true)
        count++;
        
        System.out.println(count);
    }
}
         
