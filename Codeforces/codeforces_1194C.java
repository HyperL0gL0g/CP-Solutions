import java.util.Scanner;

public class codeforces_1194C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        outer:
        while (T-- > 0) {
            String s = sc.next();
            String t = sc.nextLine();
            String p = sc.nextLine();
            if (s.length() > t.length() || s.length() == t.length() && !t.equals(s)) {
                System.out.println("NO");
                continue;
            } else
            {
                int i=0;
                for(int j=0;j<t.length();j++)
                {
                    if(s.charAt(i)==t.charAt(j))
                        i++;
                    if(i==s.length())
                        break;
                }
                if(i!=s.length())
                {
                    System.out.println("NO");
                    continue ;
                }
            }
            for(int i=0;i<t.length();i++)
            {
                String str=t.substring(i,i+1);
                int idx= s.indexOf(str);
                if(idx==-1 && p.indexOf(str)==-1)
                {
                    System.out.println("NO");
                    continue  outer;
                }
               else if(idx==-1 )
                {
                    int index=p.indexOf(str);

                }
            }






        }

    }
}

