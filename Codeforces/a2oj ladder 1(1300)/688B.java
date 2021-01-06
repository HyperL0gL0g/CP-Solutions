import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc  = new Scanner(System.in);
    String n=sc.next();
    System.out.print(n+ new StringBuilder(n).reverse().toString());
         }
}
