import java.util.*;
public class CF456A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][2];// price , quality
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            if(arr[i][0]!=arr[i][1])
            {
                flag=true;
            }
        }
        if(flag)
        System.out.println("Happy Alex");
        else
        System.out.println("Happy Alex");

    }
}
