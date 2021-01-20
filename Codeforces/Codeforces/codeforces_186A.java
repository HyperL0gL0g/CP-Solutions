import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_186A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            String a=sc.nextLine();
        String b=sc.nextLine();
        Set<Character> set  =   new HashSet<Character>();
        int c=0;
        if(a.length()!=b.length()) {
            System.out.println("NO");
            return;
        }
        for(int i=0;i<a.length();i++)
        {
if(a.charAt(i)!=b.charAt(i))
{
    c++;
    set.add(a.charAt(i));
    set.add(b.charAt(i));
}
        }
        if(set.size()==2 && c==2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
