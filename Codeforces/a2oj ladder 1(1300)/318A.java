import java.util.*;

public class MyClass {
    public static void main(String args[]) {
    Scanner sc=  new Scanner(System.in);
    long n = sc.nextLong();
    long k=sc.nextLong();
    long mid   =(long) Math.ceil(1.0*n/2);
    if(k<=mid)
    {
        //nth odd number
        System.out.println(2*k -1);
    }
    else{
    //nth even number
    k=k-mid;
    System.out.println(2*k );
    }
    }
}



   