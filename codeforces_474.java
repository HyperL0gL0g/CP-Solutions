import java.util.Scanner;

public class codeforces_474 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    String s="";
    s=sc.next();
    String op="";
    String type="";
    char c;
    int j=0;

    type=sc.next();
    String key="qwertyuiopasdfghjkl;zxcvbnm,./";
    if(s.equals("R"))
        {
            for(int i=0;i<type.length();i++)
            {
                 c = type.charAt(i);
                 j=key.indexOf(c);
                op=op+key.charAt(j-1);
            }
        }
        if(s.equals("L"))
        {
            for(int i=0;i<type.length();i++)
            {
                 c = type.charAt(i);
                 j=key.indexOf(c);
                op=op+key.charAt(j+1);
            }
        }
System.out.println(op);
    }
}
