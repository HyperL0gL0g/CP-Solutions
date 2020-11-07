import java.util.Scanner;

public class codeforces_1257B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc. nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int  y=sc.nextInt();
            if(x==1 && y!=1)
            {
                System.out.println("no");
                continue;
            }
            if((x==2 || x==3) && y>=4 )
            {
                System.out.println("no");
                continue;
            }
            System.out.println("yes");

        }
    }
}