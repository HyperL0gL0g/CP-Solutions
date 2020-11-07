import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_1323A {
    public static void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        outer:
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    p("1");
                    p(i + 1);
                    continue outer;
                } else
                    l.add(i);

            }
                if (l.size() >= 2) {
                    p(2);
                    p((l.get(0) + 1) + " " + (l.get(1) + 1  ));
                } else
                    p(-1);
            }
        }
    }
