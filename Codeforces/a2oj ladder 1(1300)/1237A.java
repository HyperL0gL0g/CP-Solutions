import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr= new int[n];
   
      int off=1;
      for(int i=0;i<n;i++)
      {
          int a = sc.nextInt();
          if(a%2==0)
          {
              System.out.println(a/2);
              continue;
          }
          else
         {
             System.out.println((a+off)/2);
             off*=-1;
         }
      }
      
    }
}