import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc  = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i] = sc.nextInt();
    Arrays.sort(arr);
    int max=arr[n-1];
    int min =arr[0];
    long maxc=0,minc=0;
  
    for(int i : arr)
    {
    if(i==max)
    maxc++;
    else if(i==min)
    minc++;
    }
     System.out.print((max-min)+" ");
    if(min==max)
    {
     
        System.out.print((long)n *(long)(n-1)/2);
    }
    else
     System.out.print(maxc*minc);
        
    }
}
    