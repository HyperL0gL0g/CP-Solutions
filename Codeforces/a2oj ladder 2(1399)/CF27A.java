import  java.util.*;
public class CF27A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int curr=1;
        for(int i :arr)
        {
        if(i!=curr)
        {
            break;
        }
        curr++;
        }
        System.out.println(curr);
    }
}
