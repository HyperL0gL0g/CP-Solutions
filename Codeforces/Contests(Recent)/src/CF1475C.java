import java.util.Scanner;

public class CF1475C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0 )
        {
            int a =sc.nextInt(); //a
            int b = sc.nextInt(); //b
            int pairs = sc.nextInt(); // k
            int[] boys= new int[pairs];
            int[] cb = new int[a+1];
            int[] girls  = new int[pairs];
            int[] cg = new int[b+1];
            for(int i=0;i<pairs;i++)
            {
                boys[i]=sc.nextInt();
                cb[boys[i]]++;
            }
            for(int i=0;i<pairs;i++) {
                girls[i] = sc.nextInt();
                cg[girls[i]]++;
            }
            long ans = 0;
                for(int i = 0;i<pairs;i++)
                ans+= pairs - cb[boys[i]] - cg[girls[i]] +1;

            System.out.println(ans/2);
        }
    }
}
