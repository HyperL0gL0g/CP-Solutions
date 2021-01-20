import java.util.Scanner;

public class codeforces_1409B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            long aa=Math.max(a-n,x);
            long bb= Math.max(b-(n-(a-aa)),y);
            long ans1=aa*bb;
            long bbb = Math.max(b-n,y);
            long aaa =  Math.max(a-(n-(b-bbb)),x);
            long ans2=bbb*aaa;
            System.out.println(Math.min(ans1,ans2));


        }
    }
}
