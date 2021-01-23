import  java.util.*;
public class CF459A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 =sc.nextInt(), y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
        int x3=0,y3=0,x4=0,y4=0;
        //case1 x1==x2

        if(x1==x2)
        {
            int dist  =Math.abs(y1-y2);
            if(y1<y2)
            {
                if(x1+dist<=1000 && y1+dist<=1000 && x2+dist<=1000 && y2+dist<=100)
                {
                    x3 = x1+ dist;
                    y3=y1+dist;
                    x4=x2+dist;
                    y4=y2+dist;
                }
                else if(x1+dist>=-1000 && y1+dist>=-1000)
                {
                    x3=x1-dist;
                    y3=y3-dist;
                }
                else
                {
                    System.out.println("-1");
                    return;
                }

            }
        }
        //case2 y1==y2
        //case3
    }
}
