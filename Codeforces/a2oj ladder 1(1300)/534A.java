import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("1");
                System.out.println("1");
        }
       else  if(n==2)
        {
            System.out.println("1");
                System.out.println("1");
        }
        else if(n==3)
        {
            System.out.println("2");
                System.out.println("1 3");
        }
    else     if(n==4)
        {
            System.out.println("4");
                System.out.println("2 4 1 3");
        }
        else
        {
        int[] arr=  new int[n+1];
        System.out.println(n);
        
       
        for(int i=1;i<=n;i+=2)
        {
                 System.out.print(i+" ");     
        }
                for(int i=2;i<=n;i+=2)
        {
                 System.out.print(i+" ");     
        }
        }
    }
}
        
     