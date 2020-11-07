import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class codeforces_1216B {
    public static void main(String[] args) {

        Scanner  sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
            Integer[] a  =new Integer[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                a[i]=i;
            }

Arrays.sort(a,(i,j)->arr[j]-arr[i]);
        int ans = 0;
        for (int i = 0; i < n; i++)
            ans += i * arr[a[i]] + 1;
        System.out.println(ans);

        for(int i: a)
            System.out.print(i+1+" ");














    }
}
