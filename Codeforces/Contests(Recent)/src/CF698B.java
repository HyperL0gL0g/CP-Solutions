    import java.util.Scanner;

    public class CF698B {
        public static void main(String[] args) {
            Scanner sc=  new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- >0)
            {
                int q =sc.nextInt();
                int d =sc.nextInt();
                int[] arr= new int[q];
                for(int i=0;i<q;i++)
                {
                  arr[i]=sc.nextInt();
                }
                for(int i =0;i<q;i++)
                {
                    while (true)
                    {
                        if(arr[i]<d)
                        {
                            System.out.println("no");
                            break;
                        }
                        if((arr[i]+"").contains(d+"") || arr[i]%d==0)
                        {
                            System.out.println("yes");
                            break;
                        }
                        arr[i]-=d;

                    }
                }

            }

        }
    }