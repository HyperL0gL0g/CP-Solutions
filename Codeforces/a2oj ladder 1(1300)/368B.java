import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
       int m = sc.nextInt();
       int[] arr1 = new int[n];
       int[] arr2 = new int[m];
       for(int i = 0 ;i<n;i++)
       arr1[i]=sc.nextInt();
            for(int i = 0 ;i<m;i++)
       arr2[i]=sc.nextInt();
       
       
       HashSet<Integer> set = new HashSet<>();
       int[] ans =new int[n];
       for(int i=n-1;i>=0;i--)
       {
           set.add(arr1[i]);
           ans[i]=set.size();
         }
         StringBuilder sb= new StringBuilder();
         for(int i=0;i<m;i++)
         {
             sb.append((ans[arr2[i]-1]));
             sb.append('\n');
         }
         System.out.println(sb.toString());
    }
}