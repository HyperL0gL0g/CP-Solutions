import  java.util.*;
public class CF695B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
                int n =sc.nextInt();
                int[] arr =new int[n];
                int[] arr2= new int[n];
                for(int i=0;i<n;i++) {
                    arr[i] = sc.nextInt();
                }
            for(int i=1;i<n-1;i++) {
                if(isH(arr,i,n)==1 || isV(arr,i,n)==1)
                arr2[i] ++;
            }
                int hill=0,valley=0;
                for(int i=1;i<n-1;i++)
                {
                    if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                        hill++;
                    if(arr[i]<arr[i-1] && arr[i]<arr[i+1])
                        valley++;

                }
                int inti=valley+hill;
                if(inti==0)
                {
                    System.out.println(0);
                    continue;
                }
                //
            int ans=inti;
            for(int i=1;i<n-1;i++)
            {
                int copy= arr[i];
                arr[i]=arr[i-1];
                inti= Math.min(inti, ans - arr2[i-1] -arr2[i]-arr2[i+1] + isH(arr,i,n)+isH(arr,i+1,n)+isH(arr,i-1,n) +isV(arr,i,n)+isV(arr,i+1,n)+isV(arr,i-1,n) );
                arr[i]=arr[i+1];
                inti= Math.min(inti, ans - arr2[i-1] -arr2[i]-arr2[i+1] + isH(arr,i,n)+isH(arr,i+1,n)+isH(arr,i-1,n) +isV(arr,i,n)+isV(arr,i+1,n)+isV(arr,i-1,n) );
                    arr[i]=copy;
            }
            System.out.println(inti);
        }
    }
//helpers
    private static int isH(int[] arr,int i,int n) {
        if(i==0 || i==n-1)
            return 0;
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            return 1;
        return 0;
    }

    private static int isV(int[] arr,int i,int n) {
        if(i==0 || i==n-1)
            return 0;
        if(arr[i]<arr[i-1] && arr[i]<arr[i+1])
            return 1;
        return 0;

    }
}
