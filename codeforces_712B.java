import java.util.Scanner;

public class codeforces_712B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dir=sc.next();
        if(dir.length()%2!=0)
        {
            System.out.println(-1);
            return;
        }

        int y=0,x=0;
        for(char c : dir.toCharArray())
        {
            if(c=='U')
                y++;
            if(c=='D')
                y--;
            if(c=='R')
                x++;
            if(c=='L')
                x--;
        }
        if(x==0 && y==0)
        {
            System.out.println(0);
            return;
        }
        y=Math.abs(y);
        x=Math.abs(x);
     //   System.out.println(x+" "+y);
            double d=Math.ceil((x+y)/2.0);
        System.out.println((int)d);
    }
}
