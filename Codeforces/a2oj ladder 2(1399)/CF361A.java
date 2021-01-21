    import  java.util.*;
    public class CF361A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int  k = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(i==j?k+" ":"0"+" ");
                }
                System.out.println();
            }
        }
    }
