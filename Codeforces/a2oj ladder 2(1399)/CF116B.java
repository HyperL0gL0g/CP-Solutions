import java.util.Scanner;

public class CF116B {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        char [][] c=new char[m][n];
        for(int i=0;i<m;i++)
        {
            c[i]=s.next().toCharArray();
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(c[i][j]=='W')
                {
                    if((i>0 && c[i-1][j]=='P') || (i<m-1 && c[i+1][j]=='P') ||(j<n-1 && c[i][j+1]=='P') || (j>0 && c[i][j-1]=='P'))
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}