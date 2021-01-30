        import java.util.Scanner;

        public class A {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while (t-- > 0) {
                    int n = sc.nextInt();
                    int k = sc.nextInt();
                    if (n % k == 0)
                        System.out.println("1");
                    else if (n > k)
                        System.out.println("2");
                    else if (k % n == 0)
                        System.out.println(k / n);
                    else
                        System.out.println(k / n + 1);

                }
            }
        }