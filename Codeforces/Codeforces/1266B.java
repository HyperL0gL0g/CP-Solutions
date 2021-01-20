import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
      int t=sc.nextInt();
    while(t-- > 0 )
      {
       long n=sc.nextLong();
       if(n>14 && n%14>0 && n%14<=6)
       System.out.println("Yes");
       else
       System.out.println("No");
      }
    }
}
       