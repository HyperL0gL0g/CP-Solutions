import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int N = 1000000;
         boolean prime[] = new boolean[N+1]; 
        for(int i=0;i<N;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=N; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= N; i += p) 
                    prime[i] = false; 
            } 
        }
        prime[1]=false;
        for(int i=0;i<n;i++)
        {
            long a  = sc.nextLong();
            double x = Math.sqrt(a);
            if(x==(int)x && prime[(int)x]==true)
            System.out.println("YES");
			else
				System.out.println("NO");
        }
    }
}