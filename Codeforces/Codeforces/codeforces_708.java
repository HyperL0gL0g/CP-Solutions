import java.util.Scanner;

public class codeforces_708 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s= sc.nextLine();
        String ans="";

        int i=0;
        while(i<s.length() && s.charAt(i)=='a')
        {
                if(i==s.length()-1)
                    ans+='z';
                else
                    ans+='a';

                i++;
        }
        boolean flag=true;
        while(i<s.length())
        {
            if(s.charAt(i)=='a') {
                flag = false;
                break;
            }
            if(flag)
                ans+=(char) (s.charAt(i)-1);

            else
                ans+=s.charAt(i);
            i++;

        }
        if(!flag)
        ans+=s.substring(i);
        System.out.println(ans);
    }
}
