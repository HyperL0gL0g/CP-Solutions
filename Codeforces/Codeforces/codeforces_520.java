
//unchecked
import java.util.Scanner;

public class codeforces_520 {
    public static void print(Object a)
    {
        System.out.println(a);
    }
public static  void main(String args[])
{
    Scanner sc = new Scanner(System.in);

int n= sc.nextInt();
String s = sc.next();
int[] alpha = new int[26];
s=s.toLowerCase();
boolean flag=false;
for(char c : s.toCharArray())
{
    alpha[c-'a']++;
}
for(int i=0;i<26;i++)
{
    if(alpha[i]==0)

    {
    flag=true;
    break;
   // System.exit(1);
    }
}
if(flag)
{
    print("NO");
}
else if(!flag)
{
    print("YES");
}







}
}
