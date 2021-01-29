        import java.util.Scanner;

        public class A {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int  t =sc.nextInt();
                while(t-- > 0)
                {
                            int  n= sc.nextInt();
                            int k =sc.nextInt();
                            int num = n;
                            while(true)
                            {
                                if(num%k==0)
                                    break;
                                num++;
                            }
                            // n is the lowest number divisible by k
                    //how to create the array???
                    //cqnnot do all 1s bcoz it will maximise the largest element
                    int notones = num - n;
                   //  System.out.println("num="+  num);
                            if(notones==0)
                            {
                                System.out.println("1");
                            }
                            else
                            {
                                //n=4,k=3,num=6;
                                int ans=Integer.MAX_VALUE;
                             for(int i=2;i<=num;i++)
                             {
                                 if(num%i==0)
                                 {
                                     int q=num/i;
                                     if(q==n)
                                     {
                                            ans = Math.min(ans,i);
                                     }
                                     else if(n>q)
                                     {
                                         int rem = n-q;
                                         //if(rem==(n-(q)))
                                         //{
                                             ans = Math.min(ans,i);
                                      //   }
                                     }

                                 }
                                 if(num%i!=0)
                                 {
                                     int q = num/i;
                                     int rem= num%i;
                                     int  blank   =n;


                                     if(n-q>0)
                                     {
                                         ans=Math.min(ans,i);
                                     }
                                     else
                                     {
                                         while(q-->0)
                                         {
                                             blank+= 1+i;
                                             if(blank<n)
                                             ans = Math.min(ans,i);

                                         }

                                     }
                                 }
                                 if(ans!=Integer.MAX_VALUE)
                                     break;
                             }
                                System.out.println(ans);
                            }

                }
            }
        }
