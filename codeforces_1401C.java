import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_1401C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
   outer : while(t-- > 0)
    {
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int min=Integer.MAX_VALUE;

        for(int  i  :  arr)
            min=Math.min(min,i);

        List<Integer> index =  new ArrayList<>();
        List<Integer> vals =  new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]%min==0)
            {
                index.add(i);
                vals.add(arr[i]);
            }
        }
        Collections.sort(vals);
        for(int i=0;i<vals.size();i++)
        {
            arr[index.get(i)]=vals.get(i);

        }

        for(int i =0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("NO");
                continue outer;
            }
        }
        System.out.println("YES");
    }





    }
}
