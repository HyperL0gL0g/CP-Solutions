import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc =  new Scanner(System.in);
     int n= sc.nextInt();
     Integer[] arr= new Integer[n];
     for(int i=0;i<n;i++)
     arr[i]=sc.nextInt();
     Arrays.sort(arr);
     if(arr[n-1]>=arr[n-2]+arr[n-3])
     {
         System.out.println("NO");
         return;
     }
     int t=arr[n-1];
     arr[n-1]=arr[n-2];
     arr[n-2]=t;
      System.out.println("YES");
     for(int i : arr)
     {
         System.out.print(i+" ");
     }
     
    }
}	