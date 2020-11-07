import java.util.*;
public class codeforces_991B
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] grades= new int[n];
        int prev_total=0;
        double grade=0.0;

        for(int i=0;i<n;i++){
            grades[i]=sc.nextInt();
            prev_total+=grades[i];
        }

        grade=(double)prev_total/n;

        if(grade>=4.5){
            System.out.print("0");
            System.exit(0);
        }
        Arrays.sort(grades);
        int ans=0;
        for(int i   : grades)
        {


                int diff=5-i;
                prev_total+=diff;
                ans++;
                grade=(double)prev_total/n;


            if(grade >= 4.5)
            {
                System.out.print(ans);
                System.exit(0);
            }
        }
    }
}