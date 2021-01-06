import java.util.*;
public class MyClass {
    
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
    String s= sc.next();
    if(s.contains("1111111") || s.contains("0000000"))
    System.out.println("YES");
    else
    System.out.println("NO");
    }
}