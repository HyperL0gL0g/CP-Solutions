import java.util.Scanner;

public class codeforces_546 {

public static void main(String args[])
{
    Scanner  sc  = new Scanner(System.in);
    int k=sc.nextInt(); //cost of 1st banana
    int n=sc.nextInt();//initil money
    int w=sc.nextInt();//no of bananas he wants to buy
    int sum=0;
    for(int i=1;i<=w;i++)
    {
sum=sum+(i*k);

    }
if(sum<=n)
{
    System.out.println("0");
}
else
{
    System.out.println(sum-n);
}

}
}
