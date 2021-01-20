import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_474B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        List<Integer> pile = new ArrayList<>();
        int n = sc.nextInt();
        int start=1;
        int pileno=1;
        int a=0;
        for (int i = 0; i < n; i++) {
             a =sc.nextInt();
            for(int j=start;j<=a;j++)
            {
                nums.add(a);
                pile.add(pileno);
            }
            start=a+1;
            pileno++;
        }

        System.out.println(nums);
        System.out.println(pile);
    }
}