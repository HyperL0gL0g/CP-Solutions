import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     String s  = sc.next();
    List<Character> l = new ArrayList<>();
    for(int i=0;i<s.length();i+=2)
    l.add(s.charAt(i));
    Collections.sort(l);
    String ans="";
    for(char c : l)
    {
        ans+=c + "+";
    }
    System.out.println(ans.substring(0,ans.length()-1));
    }
}
    