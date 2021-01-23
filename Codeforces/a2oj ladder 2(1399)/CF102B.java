import java.util.*;
public class CF102B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c=0;
        while(s.length()>1)
        {
            c++;
            int t=0;
            for(int i=0;i<s.length();i++)
            {
                t+=s.charAt(i)-'0';
            }
            s=t+"";
        }
        System.out.println(c);
        }
    }