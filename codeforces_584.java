import java.util.Scanner;

public class codeforces_584 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    /*
        long n=sc.nextLong();
    long t=sc.nextLong();
    boolean flag=false;
long i=(long)Math.pow(10,n-1);
long j=(long)Math.pow(10,n);

    for(long k=i;k<j;k++)
    {
        if(k%t==0)
        {
            System.out.println(k);
            flag=true;
            break;
        }
    }

    if(flag==false)
    {
        System.out.println("-1");
    }
*/
int n= sc.nextInt();
String t=sc.next();
while(t.length()<n)
{
    t+="0";
}
if(t.length()==n)
{
    System.out.println(t);
}
else
{
    System.out.println(-1);
}
    }
}
