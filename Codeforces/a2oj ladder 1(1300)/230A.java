import java.util.*;
public class MyClass {
    
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int s = sc.nextInt();
     int n= sc.nextInt();
     int[][] arr= new int[n][2];
     for(int i=0;i<n;i++)
     {
     arr[i][0]=sc.nextInt();
     arr[i][1]=sc.nextInt();
     }
     Arrays.sort(arr,(a,b)->a[0]-b[0]);
     
     for(int i=0;i<n;i++)
     {
        
            if(s<=arr[i][0])
            {
                System.out.println("NO");
                return;
            }
            else {
               
                s+=arr[i][1];
            }
     }
      System.out.println("YES");
    }
    
}
     
    