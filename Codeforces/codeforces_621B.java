import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_621B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[3000];
        int[] diff = new int[3000];
        int ans =0;
        for(int i =0 ;i<n;i++)
        {   
            int p =sc.nextInt();
            int q= sc.nextInt();
            ans+= sum[p+q+100]++ + diff[p-q+1000]++;
        }
        System.out.println(ans);


    }

}