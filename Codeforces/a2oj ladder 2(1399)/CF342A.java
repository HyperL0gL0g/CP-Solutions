import  java.util.*;
public class CF342A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr  =new int[8];
            for(int i=1;i<=n;i++)
            {
                arr[sc.nextInt()]++;
            }
            if(arr[5]==0 && arr[7]==0 && arr[2]>=arr[4] && arr[1]==arr[4]+arr[6]&& arr[2]+arr[3]==arr[4]+arr[6])
            {
            for(int i=0;i<arr[4];i++)
            {
                System.out.println("1 2 4");
            }
            arr[2]-=arr[4];
            for(int i=0;i<arr[2];i++)
                System.out.println("1 2 6");
            for(int i=0;i<arr[3];i++)
                System.out.println("1 3 6");
            }
            else
                System.out.println("-1");
    }

}
