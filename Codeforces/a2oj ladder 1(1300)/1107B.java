import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      while(n-- > 0)
      {
          long k = sc.nextLong();
          long x = sc.nextLong();
        System.out.println( 9*(k-1) + x);
          
      }
    }
}