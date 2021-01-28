import java.util.Arrays;
import java.util.Scanner;

public class CF102942E {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- >0)
        {
            int n    =sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            char[] str = s.toCharArray();
            int[][] dp = new int[10][s.length()];
            for(int i=0;i<10;i++)
            {
                Arrays.fill(dp[i],-1);
            }
            int ans = back(0,1,str,dp);
            System.out.println(ans);
        }
    }

    private static int back(int index, int val,char[] str,int[][] dp) {
        if (index == str.length)
            return 1;
        if(dp[val][index]!=-1)
            return dp[val][index];
        int mod= (int)(Math.pow(10,9)+7);
        int ways =0;
        for (int i = 1; i <= 9; i++)
        {
          if(i<val)
              continue;
          if(str[index]!='-' && i+'0'!=str[index])
              continue;
          ways+=back(index+1,i,str,dp);
          ways%=mod;
        }
        dp[val][index]=ways;
        return dp[val][index];
    }
}
