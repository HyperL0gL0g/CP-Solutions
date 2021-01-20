import java.util.*;
public class codeforces_1230B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int  k=sc.nextInt();
        String s=sc.next();
        if(s.length()==1 && k!=0)
        {
            System.out.println("0");
            System.exit(0);
        }

      if(k==0) {
          System.out.println(s);
      System.exit(0);
      }

        StringBuilder sb =new StringBuilder();
        int i=0;
        for(i=0;i<s.length() && k >  0;i++)
        {
            if(i==0 && s.charAt(i)!='1' && s.charAt(i)!='0' ) {
                sb.append('1');
                k--;
            }
         else if(i>0 && s.charAt(i)!='0')
        {
            k--;
         sb.append('0');
        }
         else
             sb.append(s.charAt(i));
        }
        if(i!=s.length())
            sb.append(s.substring(i));
        System.out.println(sb.toString());

    }
}
