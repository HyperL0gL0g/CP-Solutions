import java.util.Arrays;
import java.util.Scanner;

public class codeforces_580A {
    public static void p(Object o) {
        System.out.print(o);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
int max=1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1])
                dp[i] = dp[i - 1] + 1;
            max= Math.max(max,dp[i]);
        }
        //p(Arrays.toString(dp));
        p(max);

    }
}
