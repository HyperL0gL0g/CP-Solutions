import java.util.*;
public class codeforces_1321A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
       // int b[]  = new int[n];
        for(int i  =0;i<n;i++)
        {
            a[i]+=sc.nextInt();
        }
        for(int i  =0;i<n;i++)
        {
            a[i]-=sc.nextInt();
        }

int iwin=0,theywin=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
                iwin++;
            else if(a[i]==-1)
                theywin++;
        }

        if(iwin==0)
            System.out.println("-1");
        else
            System.out.println((theywin/iwin)+1);









    }


}

