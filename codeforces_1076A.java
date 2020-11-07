import java.util.Arrays;
import java.util.Scanner;

public class codeforces_1076A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String s = sc.next();
        //String sn = new String();

        char[] str = sc.next().toCharArray();
        int pos = n-1;
       // System.out.println(Arrays.toString(str));

        for (int i=0;i+1<n;i++) {
            if (str[i] > str[i+1]) {
                pos = i;
                break;
            }
        }

        for (int i=0;i<n;i++) {
            if (i==pos)
                continue;
            System.out.print(str[i]);
        }





    }
}
