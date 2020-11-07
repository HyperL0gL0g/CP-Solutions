import java.util.Scanner;

import static java.lang.Math.floor;

public class codeforces_1352C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = (int) ((int) k + floor((k - 1) / (n - 1)));
            System.out.println(ans);
        }
    }
}
