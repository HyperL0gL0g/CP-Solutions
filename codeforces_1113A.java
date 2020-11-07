import java.util.Scanner;
//just remember whenever we are travelling we have to minimise the cost,therefore whenever tank is not full , we have to make it full bcoz the more we wait the price increases,therefore we need to refuel as soon as we can .that is the greedy part
public class codeforces_1113A {
public static void p(Object o )
{
    System.out.println(o);
}

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n  = sc.nextInt();//end point
        int v= sc.nextInt();//litres
        int distance_to_be_covered=n-1;  //kms
         if(distance_to_be_covered<=v)
            p(distance_to_be_covered);
        else
        {
            int money_spent=v;//initially this amount has to be spent
            int init=1;
            while (distance_to_be_covered>v)
            {
                init++;
                distance_to_be_covered--;
                money_spent+=init;

            }
        p(money_spent);
        }

    }






}
