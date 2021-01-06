import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    int count=0;
    while(n-- > 0 )
    {
        sum=0;
        sum=sc.nextInt()+sc.nextInt()+sc.nextInt();
        if(sum>=2)
        count++;
    }
    System.out.println(count);
    }
}