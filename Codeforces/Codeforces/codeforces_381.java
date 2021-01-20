import java.util.Scanner;

public class codeforces_381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int turn = 0;
        int p1 = 0, p2 = 0;
        int l = 0, h = n - 1;
        while (true) {
            int max = arr[l] >= arr[h] ? arr[l] : arr[h];
            if (turn % 2 == 0) {
                p1 += max;
            } else
                p2 += max;
            turn++;
            if (max == arr[l])
                l++;
            if (max == arr[h])
                h--;
            if (l > h)
                break;

        }
        System.out.print(p1 + " " + p2);
    }
}

