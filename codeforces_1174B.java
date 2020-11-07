import java.util.*;

public class codeforces_1174B {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr= new ArrayList<>();
        int even=0,odd=0;
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
            if(arr.get(i)%2==0)
                even++;
            else if(arr.get(i)%2!=0)
                odd++;
        }
        if(odd>0 && even>0)
           Collections.sort(arr);

            for(int i  : arr)
                System.out.println(i+" ");

        // 8 6 4 2 1  













    }
}
