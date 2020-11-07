import java.util.Scanner;

public class codeforces_230 {
public static void main(String args[])
    {
    boolean flag=false;
        Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int d=sc.nextInt();
    while(d!=0)
    {
        int sd=sc.nextInt();
        int b=sc.nextInt();
        if(sd<s)
        {
            s=s+b;
            d--;
            flag=true;
        }
    else if(sd>=s)
        {
            flag=false;
            break;
        }
    }
   if(flag==false)
   {
       System.out.println("NO");
   }
else if(flag==true)
   {
       System.out.println("YES");
   }




    }

}
