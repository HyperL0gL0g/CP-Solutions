import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] c = new int[3];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
        }
       
        for(int i=0;i<n;i++)
        {
            int curr =arr[i];
            if(arr[i]==25)
        c[0]++;
        if(arr[i]==50)
        c[1]++;
        if(arr[i]==100)
        c[2]++;
        int ret = curr-25;
            while(ret - 100 >=0 && c[2]>0)
            {
                ret-=100;
                c[2]--;
            }
             while(ret - 50 >=0 && c[1]>0)
            {
                ret-=50;
                c[1]--;
            }
             while(ret - 25 >=0 && c[0]>0)
            {
                ret-=25;
                c[0]--;
            }
            //  System.out.println(ret);
            if(ret!=0)
            {
                System.out.println("NO");
                return;
            } 

        
        }
        System.out.println("YES");
        
        
    
    }
}