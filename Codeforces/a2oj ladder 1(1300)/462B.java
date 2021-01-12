import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      int k  = sc.nextInt();
      String s  = sc.next();
     int[] arr= new int[26];
     for(char c:  s.toCharArray())
     {
         arr[c-'A']++;
     }
      Arrays.sort(arr);
       long sum=0;
       
      for(int i=25;i>=0;i--)
      {
         long x = Math.min(k,arr[i]);
         sum+=x*x;
         k-=x;
       
         
      }
      System.out.println(sum);
    }}
     