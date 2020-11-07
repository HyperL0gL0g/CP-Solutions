import java.util.Arrays;
import java.util.Scanner;

public class codeforces_651B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

       // Arrays.sort(arr);
        int c=0;
        int init=0;
        for(int i=1;i<n;i++)
        {

                if(arr[init]==-1 || arr[i]==-1){
                    continue;

                }
            if(arr[i]>arr[init])
            {
                c++;
                init++;

            }

        }

        System.out.println(c);
    }
}
