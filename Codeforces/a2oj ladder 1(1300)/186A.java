import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s  =sc.next();
    String t = sc.next();
    int n =s.length();
    if(t.length()!=n)
    {
        System.out.println("NO");
        return;
    }
    int c=0;
    HashSet<Character> set  = new HashSet<>();
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)!=t.charAt(i))
        {
            set.add(s.charAt(i));
            set.add(t.charAt(i));
            c++;
        }
    }
    if(c==2 && set.size()==2)
    {
                System.out.println("YES");
    }
    else
            System.out.println("NO");
    }
}