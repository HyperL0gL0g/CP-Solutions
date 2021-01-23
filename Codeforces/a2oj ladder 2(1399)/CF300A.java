import java.util.*;
public class CF300A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int neg = 0, pos = 0, z = 0;
        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                z++;
            }
            if (a < 0) {
                neg++;
                negative.add(a);
            }
            if (a > 0) {
                pos++;
                positive.add(a);
            }
        }
//case1 : no positive
        if (pos == 0) {
            //negatives
            int N=negative.size();
            System.out.print("1" + " " + negative.get(0));
            negative.remove(0);
            System.out.println();
            //positives
            System.out.print(2+ " ");
            for (int i = 0; i < 2; i++) {
                System.out.print(negative.get(i) + " ");

            }
            negative.remove(0);
            negative.remove(0);
            int l=negative.size();
            //zeros
            System.out.println();
            System.out.print(z+l + " ");
            while (z-- > 0)
                System.out.print("0" + " ");
            for(int i:negative)
                System.out.print(i+" ");

        }
        //case2 : some negative some positive
        else {
            //negatives

            int len =negative.size();
            System.out.print("1" + " " + negative.get(0));
            negative.remove(0);
            System.out.println();
            len=negative.size();


            //positives
            int len2 = positive.size();
            System.out.print(len2 + " ");

            for (int i : positive) {
                System.out.print(i + " ");
            }
            System.out.println();

            //zeros
            System.out.print(z+len + " ");
            while (z-- > 0)
                System.out.print("0" + " ");
            for(int i : negative)
                System.out.print(i+" ");

        }

    }
}