import java.util.Scanner;
public class codeforces_6C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);int n=sc.nextInt();int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] =sc.nextInt();
        int l=0,h=n-1,a=0,b=0,alice_time=0,bob_time=0;
        while(l<=h){
            if(alice_time<=bob_time) alice_time+=arr[l++];
            else bob_time+=arr[h--];}
        System.out.println(l+" "+(n-l));}}