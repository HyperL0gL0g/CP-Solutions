import  java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time =sc.nextInt();
        int power=sc.nextInt();
        boolean flag =false;
        for(int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            int p=sc.nextInt();
            if(t>=time || p<=power)
            {
                flag=false;
            }
            if(t<time && p>power)
            {
                flag=true;
                break;
            }
        }
        System.out.println(flag==true?"Yes":"No");
    }
}
