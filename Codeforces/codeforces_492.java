import java.util.Scanner;

public class codeforces_492 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cubes = sc.nextInt();
        int sum = 0;
        int row=1;


        while(cubes>=0)
        {
        sum=sum+row;

        cubes=cubes-sum;
        if(cubes>=0) {
            row = row + 1;
        }

        }
        System.out.println(row-1);
    }
}
