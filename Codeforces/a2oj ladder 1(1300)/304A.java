import java.util.*;
  
public class MyClass 
{
    public static void main(String args[]) 
    {
    Scanner sc  = new Scanner(System.in);
    int n =sc.nextInt();
    int c=0;
    for(int i=1;i<=n;i++)
    {
        for(int j=i+1;j<=n;j++)
        {
            int x  =(int)Math.sqrt(i*i + j*j);
            if(x*x  == i*i +j*j && x<=n)
            c++;
        }
    }
    System.out.println(c);
    }
}
   