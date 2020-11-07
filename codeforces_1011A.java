import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_1011A {
    public static void p(Object o )
    {
        System.out.println(o);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        String s = sc.next();
        if (s.length() < k) {
            p("-1");
            System.exit(0);
        }
        char[] arr = s.toCharArray();
        int ans = 0;
        Arrays.sort(arr);
       // p(Arrays.toString(arr));
        ans += arr[0] - 'a' + 1;
        int i = 1;
        char c = arr[0];
       // p(c);
        k-=1;
        while (k > 0) {
            if(i==arr.length)
            {
                p("-1");
                System.exit(0);
            }
            for (; i < arr.length; ) {
                if (arr[i] - c >= 2) {
                    ans += arr[i] - 'a' + 1;
                 //   p(arr[i]);
                    k--;
                    c = arr[i];
                    break;
                }

                i++;
            }

        }
    //    p("");
        p(ans);
    }}