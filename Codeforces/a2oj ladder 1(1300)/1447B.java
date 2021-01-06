import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc  = new Scanner(System.in);
   int t=sc.nextInt();
   while(t-- >0)
   {
    int n=sc.nextInt();
    int m=sc.nextInt();
    int min=Integer.MAX_VALUE;
    int neg=0;
    int s=0;
    for(int i=0;i<n*m;i++)
    {
        int a=sc.nextInt();
        s+=Math.abs(a);
        if(a<0)
        neg++;
        min=Math.min(min,Math.abs(a));
    }
    if(neg%2==0)
    System.out.println(s);
    else
    System.out.println(s-2*min);  
   }
}
}

//11 22 33 44 55  66 77  88 99 1001 1111 1 21