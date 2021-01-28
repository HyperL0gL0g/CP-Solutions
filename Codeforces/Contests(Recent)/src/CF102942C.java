import java.util.Arrays;
import java.util.Scanner;

public class CF102942C {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int l=0,h=n-1;
            //1 2 3 4 5
            int curr=0;
            while(l<=h)
            {
              //  System.out.println(arr[l]+" "+arr[h]);
                if(l==h)
                    break;
                boolean flag=false;
                if(arr[h]>=k)
                {
                    h--;
                    curr++;
                    flag=true;
                }
                else if(arr[l]>=k)
                {
                    curr++;
                    l++;
                    flag=true;
                }
                else if(arr[l]+arr[h]>=k)
                {
                    l++;
                    h--;
                    curr++;
                    flag=true;
                }
                else
                {
                    l++;
                    flag=true;

                }

                if(!flag)
                    break;
            }
            if(l==h && arr[l]>=k)
                curr++;
            System.out.println(curr);
        }
    }
}
// 5 5 3 2 1
// 5 5 3