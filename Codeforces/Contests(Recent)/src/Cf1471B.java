import java.util.*;
public class Cf1471B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0 )
        {
            int n = sc.nextInt();
            int x=sc.nextInt();
            int[] arr =new int[n];
            int[] arr2 = new int[n];
            long sum=0;
            for(int i=0;i<n;i++)
            {
                int a =sc.nextInt();
                sum+=a;
                arr[i]=a;
                arr2[i]=a;
            }
            boolean flag = true;
            int i=0;
            //  System.out.println(l);
            while(flag)
            {
                    if(arr[i]%x==0)
                    {
                        sum+=arr2[i];
                        arr[i]/=x;
                    }
                    else
                        flag=false;
                    i++;
                    if(i==n)
                        i=0;
            }
          /*   System.out.println(l);
            System.out.println(sum);
            for(int k : l)
                sum+=k;*/
            System.out.println(sum);
        }
    }
}