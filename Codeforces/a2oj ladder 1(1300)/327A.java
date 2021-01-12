import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      int[] arr =  new int[n];
      for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
      int ans=0;
      for(int i=0;i<n;i++)
      {
          for(int j=i;j<n;j++)
          {
          int c=0;
          for(int k=0;k<n;k++)
       {
           if(k>=i && k<=j)
           {
               c+=1-arr[k];
           }
           else
           c+=arr[k];
       }
       ans=Math.max(ans,c);
       }
    }
              
      System.out.println(ans);
    }
}