import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
      Scanner sc  = new Scanner(System.in);
     int n =sc.nextInt();
    int[] arr= new int[1001];
    
    for(int i=0;i<n;i++)
    arr[sc.nextInt()]++;
 //   Arrays.sort(arr);
  //  System.out.println(Arrays.toString(arr));
    for(int i=0;i<1001;i++)
    {
        if(arr[i]>Math.ceil(n/2.0))
        {
            System.out.println("NO");
            return;
        }
    }
        System.out.println("YES");
    }
}
    