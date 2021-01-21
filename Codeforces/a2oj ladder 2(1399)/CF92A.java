import java.util.*;
public class CF92A {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int c=sc.nextInt();
            int requirement = n*(n+1)/2;
            if(c<=requirement)
            {
                    for(int i=1;i<=n;i++)
                    {
                        if(c>=i)
                        {
                            c-=i;
                        }
                        else
                            break;
                      //  System.out.println(c);
                    }
                System.out.println(c);
            }
            else
            {
                int left =c%requirement;
                for(int i=1;i<=n;i++)
                {
                    if(left>=i)
                    {
                        left-=i;
                    }
                    else
                        break;
                }
                System.out.println(left);

            }
    }
}
