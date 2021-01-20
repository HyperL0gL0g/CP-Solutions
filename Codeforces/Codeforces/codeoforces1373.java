import java.util.Scanner;

public class codeoforces1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int ones = 0, zeros = 0;
            for (char c : s.toCharArray()) {
                if (c == '0')
                    zeros++;
            }
            ones = s.length() - zeros;
            int d = Math.min(zeros, ones);
            if (d % 2 != 0)
                System.out.println("DA");
            else
                System.out.println("NET");
        }
    }

}