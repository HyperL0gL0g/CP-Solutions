import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      int m  = sc.nextInt();
      int d =sc.nextInt();
      int[] arr =  new int[n*m];
      for(int i  =0  ;i < n*m; i++)
      {
          arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      int mid  = (n*m)/2;
      int middle = arr[mid];
      int sum =0;
      
      for(int i=0; i<n*m; i++)
      {
        sum += (int)Math.abs(arr[i]-middle);    
      }
      if(sum%d==0)
      {
          System.out.println(sum/d);
      }
      else
       System.out.println("-1");
      
    }
}
      