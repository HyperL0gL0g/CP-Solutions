import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_160 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int my_sum=0;
        int twin_sum=0;
        ArrayList<Integer> list =new ArrayList<>(n);
       for(int i=0;i<n;i++)
       {
           int x=sc.nextInt();
           list.add(x);
           twin_sum+=x;
       }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        System.out.println(twin_sum);


        int count=0;
        for(int i=0;i<n;i++) {
            my_sum += list.get(i);
            twin_sum -= list.get(i);

            if(my_sum<=twin_sum)
            {
              count++;
            }
        if(my_sum>twin_sum)
        {
            count++;
            System.out.println(count);
            break;
        }
        }




    }
}
