import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] upper =  new int[n];
        int[] lower =  new int[n];
        int u=0,l=0;
        boolean odd=false;
        for(int i =0;i<n;i++)
        {
            upper[i]=sc.nextInt();
            u+=upper[i];
            lower[i]=sc.nextInt();
            l+=lower[i];
            if((upper[i]+lower[i])%2==1)
            odd=true;
        }
        if(u%2==0 && l%2==0)
        {
            System.out.println("0");
            return ;
        }
        if(l%2==1 && u%2==1 && odd && n>1)
        {
            System.out.println("1");
            return ;
        }
        else
         System.out.println("-1");
        
    
    }
}