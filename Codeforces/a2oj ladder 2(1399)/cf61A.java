import java.util.*;
public class cf61A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 =sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
                    sb.append(1);
            else
                sb.append(0);
        }
        System.out.println(sb.toString());
    }
}
