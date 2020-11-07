import java.util.Arrays;
import java.util.Scanner;

public class codeforces_313B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int t=sc.nextInt();
        StringBuilder sb1=new StringBuilder();
        int[] arr = new int[s.length()];
        for(int i=1;i<s.length();i++)
        {
            arr[i] = (s.charAt(i)==s.charAt(i-1))?arr[i-1]+1:arr[i-1];
        }
       // System.out.println(Arrays.toString(arr));
        while(t--  > 0)
        {
            int l=sc.nextInt()-1;
            int r=sc.nextInt()-1;
            int c=0,max=0;
           // StringBuilder sb =new StringBuilder(s);

            int ans = arr[r] - arr[l];


            sb1.append(ans+"\n");
            //System.out.println(c);

        }
        System.out.println(sb1);
    }
}
