import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      int k=sc.nextInt();
      int[] arr= new int[12];
      for(int i=0;i<12;i++)
      arr[i]=sc.nextInt();
      Arrays.sort(arr);
      int ans=0;
      int i=11;
      
      while(k>0 && i>=0)
      {
          k-=arr[i];
          ans++;
          i--;
      }
      if(k>0)
      System.out.println("-1");
      else
      System.out.println(ans);
      
      
    }
}