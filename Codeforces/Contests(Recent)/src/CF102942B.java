import java.util.Scanner;

public class CF102942B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            int odd=0;
            int even=0;
            for(int i=0;i<n;i++)
            {
                int c = sc.nextInt();
                if(c%2==0)
                    even++;
                else
                    odd++;
            }
            System.out.println(odd>0?even :"-1");

        }
    }
}
