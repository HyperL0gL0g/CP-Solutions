import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- > 0 )
      {
          int n =sc.nextInt();
          int s=0;
          int e=0,o=0;
          while(n--  >  0 )
          {
              int a = sc.nextInt();
              if(a%2==0)
              e++;
              else
              o++;
              s+=a;
          }
          if(s%2!=0)
          {
              System.out.println("YES");
              continue;
          }
          if(e==0 || o==0)
          {
               System.out.println("NO");
              continue;
          }
          System.out.println("YES");
          
      }
    }
}
