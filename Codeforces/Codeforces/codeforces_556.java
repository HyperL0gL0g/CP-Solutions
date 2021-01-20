import java.util.Scanner;

public class codeforces_556 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        //StringBuilder sb = new StringBuilder(s);
        String str = "";
        int count = 0;
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(Math.abs(a - b));
    }}