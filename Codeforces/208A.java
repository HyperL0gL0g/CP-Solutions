import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
      Scanner sc =new Scanner(System.in);
      String s= sc.next();
      s=s.replaceAll("WUB"," ");
      s=s.trim();
      System.out.println(s);
    }
}
      