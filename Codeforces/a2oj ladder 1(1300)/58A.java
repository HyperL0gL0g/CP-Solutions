	import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc  = new Scanner(System.in);
     String s  = sc.next();
     System.out.println(s.matches(".*h.*e.*l.*l.*o.*")?"YES":"NO");
    }
}