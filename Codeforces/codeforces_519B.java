import java.util.Scanner;

public class codeforces_519B {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
       // int[] arr =new int[n];
        long sum=0L;
        for(int i=0;i<n;i++){
          //  arr[i]=sc.nextInt();
            sum+=sc.nextInt();

        }
        //int[] arr2= new int[n-1];
        long sum2=0L;
        for(int i=0;i<n-1;i++)
    {
     //arr2[i]=sc.nextInt();   sput
            sum2+=sc.nextInt();
    }
        System.out.println(sum-sum2);
       // int[] arr3= new int[n-2];
        long sum3=0L;
        for(int i=0;i<n-2;i++ )
        {
            sum3+=sc.nextInt();
        }
        System.out.println(sum2-sum3);

    }
}
