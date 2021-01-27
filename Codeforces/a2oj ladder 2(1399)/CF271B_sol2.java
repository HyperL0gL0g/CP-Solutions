import  java.util.*;
public class CF271B_sol2 {
    static boolean[] primes = new boolean[100004];
    static TreeSet<Integer> tset   =  new TreeSet<>();
    static List<Integer> l =  new ArrayList<>();

    public static void main(String[] args) {
        sieve();
        Scanner sc   = new Scanner(System.in);
        int r=sc.nextInt();
        int c =sc.nextInt();
        int[] rows = new int[r];
        int[] cols = new int[c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int curr = sc.nextInt();
                if(primes[curr]) //not a prime number
                {
                    int index = Collections.binarySearch(l,curr);
                    if(index<0) //
                        index = -(index+1);

                    rows[i]+=l.get(index)-curr;
                    cols[j]+=l.get(index)-curr;

                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i :rows)
            min=Math.min(i,min);

        for(int i :cols)
            min=Math.min(i,min);
        //  System.out.println(Arrays.toString(rows)+" "+Arrays.toString(cols));
        System.out.println(min);
    }

    private static void sieve() {
        primes[0] = true;
        primes[1] = true;
        for(int i = 2 ; i < 100004 ; i++){
            for(int j = i+i ; j < 100004 ; j+=i){
                primes[j] = true;
            }
        }
        for(int i = 0 ; i < 100004 ; i++) if(!primes[i]) l.add(i);

    }
}
