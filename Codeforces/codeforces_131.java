import java.util.Scanner;

public class codeforces_131 {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String str="";
if(s.length()==1 && Character.isLowerCase(s.charAt(0)))
{
    System.out.println(Character.toUpperCase(s.charAt(0)));
    System.exit(1);
}
if(Character.isUpperCase(s.charAt(0)) && Character.isUpperCase(s.charAt(1)))
{
   str=str+s.charAt(0);
    for(int i=1;i<s.length();i++)

    {
      str+=Character.toLowerCase(s.charAt(i));
    }
}
else if(Character.isLowerCase(s.charAt(0)) && Character.isUpperCase(s.charAt(1)))
{
    str=str+Character.toUpperCase(s.charAt(0));
    for(int i=1;i<s.length();i++)
    {
     str+=Character.toLowerCase(s.charAt(i));
    }

}
else
{
    str=s;
}

System.out.print(str);










}
}
