import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
   int n =sc.nextInt();
   int c1=0,c2=0;
   for(int i=0;i<n;i++)
   {
       if(sc.nextInt()==100)
       c1++;
       else
       c2++;
   }
  if(c1%2==0 && c2%2==0)
  System.out.println("YES");
  else if(c1==0 && c2%2!=0)
  System.out.println("NO");
    else if(c1%2==0 && c2%2!=0)
    System.out.println("YES");
    else
    System.out.println("NO");
  
  
  
    }
    
}