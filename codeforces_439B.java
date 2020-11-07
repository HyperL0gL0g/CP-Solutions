import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_439B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int subs= sc.nextInt();
        long time_per_chpater=sc.nextInt();
Long[] arr =new Long[subs];
for(int i=0;i<subs;i++)
{
    long ch=sc.nextInt();
    arr[i]=ch;
}
        Arrays.sort(arr);
long time=0;
for(long i :  arr)
{
long curr  =i*time_per_chpater;
    time+=curr;

    if(time_per_chpater!=1)
        time_per_chpater--;

}
        System.out.println(time);
    }
}
