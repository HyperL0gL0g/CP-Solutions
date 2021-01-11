import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      int[][] arr = new int[n][2];
      int minx=Integer.MAX_VALUE;
      int maxx=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
      {
          arr[i][0]=sc.nextInt();
          arr[i][1]=sc.nextInt();
          minx=Math.min(minx,arr[i][0]);
          maxx=Math.max(maxx,arr[i][1]);
      }
    //  Arrays.sort(arr, (a,b)->a[0]-b[0]);
      for(int i=0;i<n;i++)
      {
          if(arr[i][0]<=minx && arr[i][1]>=maxx)
          {
              System.out.println(i+1);
              return ;
          }
      }
       System.out.println("-1");
      
    }
}