import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
      int t=sc.nextInt();
     outer: while(t-- > 0 )
      {
          int n =sc.nextInt();
          int curr=9;
          int num=1;
          String s="";
          if(n<10)
          {
              System.out.println(n);
              continue outer;
          }
          if(n>45)
          {
              System.out.println("-1");
              continue outer ;
          }
          while(curr>0)
          {
              if(curr<=n)
              {
                  n-=curr;
                  s+=curr;
                  curr--;
                  
              }
              else
              curr--;
              if(n==0)
              {
                  System.out.println(new StringBuilder(s).reverse());
                  continue outer;
              }
          }
          System.out.println("-1");
      }
    }
}
