import java.util.*;
public class CF75A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong();
        long b =sc.nextLong();
        long c = a+b;
        long A = Long.parseLong((a+"").replaceAll("0",""));
        long B = Long.parseLong((b+"").replaceAll("0",""));
        long C = Long.parseLong((c+"").replaceAll("0",""));

        System.out.println(A+B==C?"YES":"NO");
    }
}
