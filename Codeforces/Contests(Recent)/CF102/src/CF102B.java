import  java.util.*;
public class CF102B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next(), q = sc.next();
            String s2 = s, q2 = q;
            while (s2.length() != q2.length()) {
                if(s2.length()<q2.length())
                {
                    s2+=s;
                }
                else
                    q2+=q;
            }
            System.out.println(s2.equals(q2)?s2:"-1");
        }
    }
}
