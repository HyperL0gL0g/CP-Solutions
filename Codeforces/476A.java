import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      if(n<m)
      {
          System.out.println("-1");
      }
      else
      {
          if(m==n)
          {
                System.out.println(m);
          }
          else
          {
              int moves = n/2 + n%2;
              if(moves<=m)
              System.out.println(m);
              else
              {
                  System.out.println(moves%m==0 ? moves  : moves-moves%m+m );
              }
          }
      }
    }
}
      