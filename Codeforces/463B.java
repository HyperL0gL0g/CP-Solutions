import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int s=0;
      int[] arr= new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
          s=Math.max(s,arr[i]);
      }
      
          System.out.println(s);
       
      }
          
      }