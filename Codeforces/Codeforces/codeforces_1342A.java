import java.util.Scanner;

public class codeforces_1342A {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int t=sc.nextInt();


        while(t--  >  0)
        {
            long x=sc.nextLong();
            long y=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long diff=Math.abs(x-y);
            long cost1 = diff*a;
            long cost2= Math.min(x,y)*b;
            long cost3=x*a+y*a;
            System.out.println(Math.min(cost1+cost2,cost3));
        }
    }
}
