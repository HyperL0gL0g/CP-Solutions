import java.util.Scanner;

/*public class B {
    static int[][] cache = new int  [51][51*30];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt();
            int[][] plates = new int[51][31];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    plates[i][j] = sc.nextInt();
                }
            }
        }
    }

    private static int rec(int index, int taken, int n, int k,int p) {
        if(taken==p)
            return 0;
        if(index>n ||taken>p)
        {
            return -1000000000;
        }
            int ans = (int) -1e9;
        for(int i=0;i<=k;i++)
        {
           ans =   prefix[index][i] +rec(index+1, taken+i, int n ,int k);
        }
        return ans;
    }
}*/