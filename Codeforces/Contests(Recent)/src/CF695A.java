import java.util.*;
public class CF695A {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0 )
        {
            int num = sc.nextInt();
            System.out.print("9");
            for(int i=2,j=8;i<=num;i++,j++)
            {
                System.out.print(j);
                if(j==9)
                    j=-1;
            }
            System.out.println();

        }

    }
}
/*
n==1
9
n==2
98
n==3
989
n==4
9890

 */