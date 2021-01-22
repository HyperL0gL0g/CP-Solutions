import  java.util.*;
public class CF168A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int wiz =sc.nextInt();
        int per=sc.nextInt();
        int min = (int)Math.ceil(per*n*1.0/100);
        if(min<=wiz)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(min-wiz);
        }

    }
}
