import java.util.Arrays;
import java.util.Scanner;

public class codeforces_1294B
{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t=sc.nextInt();
        while(t--  > 0)
        {
            int n=sc.nextInt();

            int[][] points = new int[n][2];
            for(int i=0;i<n;i++)
            {
                points[i][0]=sc.nextInt();
                points[i][1]=sc.nextInt();
            }
           // System.out.println(Arrays.deepToString(points));
            Arrays.sort(points,(a,b)-> a[0]==b[0]? Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));
           // System.out.println(Arrays.deepToString(points));
           // System.out.println("------------------");
            StringBuilder sb = new StringBuilder();
            boolean cont=true;
            int x=0,y=0;
            for(int i=0;i<n;i++)
            {
                if(points[i][1]<y)
                {
                    cont=false;
                    break;
                }
                while(x<points[i][0])
                {
                        sb.append("R");
                        x++;
                }
                while(y<points[i][1])
                {
                    sb.append("U");
                    y++;
                }

            }
            if(cont)
            {
                System.out.println("YES");
                System.out.println(sb);
            }
            else
            {
                System.out.println("NO");

            }

        }
    }
}
