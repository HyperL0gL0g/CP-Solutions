import java.util.*;

public class codeforces_734 {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0;
         a = s.replaceAll("A", "").length();
    if(n-a>a)
    {
        System.out.println("Anton");
    }
    else if(n-a<a)
    {
        System.out.println("Danik");
    }
    else
    {
        System.out.println("Friendship");
    }
    }}