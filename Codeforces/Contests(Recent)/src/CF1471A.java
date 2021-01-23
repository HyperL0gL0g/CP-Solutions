import  java.util.*;
public class CF1471A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //maximum when /c operation is done more frequently as everytime we get ceil value
        //minimum when we do /c operation once as we are getting ceil only once

        while(t-- > 0 )
        {
            int n =sc.nextInt();
            double x =sc.nextDouble();
            //int[] arr = new int[n];
            long max=0,min=0;
            for(int i=0;i<n;i++)
            {
                double a=sc.nextDouble();
                    max+= Math.ceil(a/x);
                min+=a;
            }
            System.out.println((long)Math.ceil(min/x)+" "+ max);

        }
    }
}

/*
2 3 4 5
2
1+2+2+3
7
 */