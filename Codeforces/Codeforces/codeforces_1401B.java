

import java.util.Scanner;

public class codeforces_1401B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int t = sc.nextInt();
        while( t-- > -0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int z1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int z2 = sc.nextInt();
            int ans=0;
           int rem=Math.min(z1,y2);
           ans+=2*rem;
           z1=z1-rem;
           y2=y2-rem;

           if(z2!=0)
               z2-=Math.min(z2,x1);
           if(z2!=0)
               z2-=Math.min(z2,z1);
            ans-=2*z2;
            System.out.println(ans);
        }
    }
}
