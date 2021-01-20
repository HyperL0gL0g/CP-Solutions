import java.time.Year;
import java.util.Scanner;

public class codeforces_1409C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >  0){
            int n=sc.nextInt();
            int x= sc.nextInt();
            int y =sc.nextInt();
                int best=Integer.MAX_VALUE;
                int[] bestA=null;
                for(int start=1;start<=50;start++)
                {
                    for(int diff = 1;diff<=50;diff++)
                    {
                        boolean X=false,Y=false;
                        int[] a= gen(n,start,diff);
                        for(int i : a)
                        {
                            if(i==x)
                                X=true;
                            if(i==y)
                                Y=true;
                        }
                        if(X&&Y && a[n-1]<best)
                        {
                            best=a[n-1];
                            bestA=a;
                        }

                    }
                }
                for(int i  : bestA)
                {
                    System.out.print(i+" ");
                }
            System.out.println();
        }
    }

    private static int[] gen(int n, int start, int diff) {
    int[] a = new int[n];
    a[0]=start;
        for(int i=1;i<n;i++)
            a[i]=a[i-1]+diff;
        return a;
    }
}
