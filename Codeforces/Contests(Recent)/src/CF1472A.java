import java.util.*;
public class CF1472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            int p = 1;
            while (w % 2 == 0) {
                w = w / 2;
                p = p * 2;
            }
            while (h % 2 == 0) {
                h = h / 2;
                p = p * 2;
            }
            System.out.println(p>=n?"YES":"NO");
        }
    }
}

