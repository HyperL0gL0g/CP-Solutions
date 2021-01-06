import java.util.*;

public class MyClass {
    public static void main(String args[]) {
    Scanner sc=  new Scanner(System.in);
    int n=sc.nextInt();
    if(n==2)
    {
        System.out.println("1 2");
        return ;
    }
    int[] index = new int[2];
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    
    int  min = Math.abs(arr[0]-arr[n-1]);
    index[0]=1;
    index[1]=n;
    
    for(int i =1;i<n;i++){
    int curr  = Math.abs(arr[i]-arr[i-1]);
    if(curr<min)
    {
        min =curr;
        index[0]=i;
        index[1]=i+1;
    }
    }
    
    System.out.println(index[0]+" "+index[1]);
    }
}
   
   
   