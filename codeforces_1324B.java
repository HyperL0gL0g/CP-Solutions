import java.util.Scanner;

public class codeforces_1324B {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
         outer: while(t--  >  0)
        {
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=i+2;j<n;j++)
                {
                    if(arr[i]==arr[j]) {
                        System.out.println("Yes");
                                continue outer;
                    }
                }
            }
            System.out.println("NO");



        }
    }
}
