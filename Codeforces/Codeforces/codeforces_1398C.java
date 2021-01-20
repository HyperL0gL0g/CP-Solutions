import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class codeforces_1398C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                int t  =  sc.nextInt();
                while(t-- >  0)
                {
                    int n =sc.nextInt();
                    String  s= sc.next();
                    int[] arr= new int[n];
                    int i=0;
                    for(char c:  s.toCharArray())
                        arr[i++]=(c-'0')-1;

                  //  System.out.println(Arrays.toString(arr));
                    int[] pref= new int[n];
                    pref[0]=arr[0];
                    for(int j=1;j<n;j++)
                        pref[j]=pref[j-1]+arr[j];
                 //   System.out.println(Arrays.toString(pref));
                    HashMap<Integer,Integer> map  = new HashMap<>();
                    map.put(0,1);
                    long ans=0;
                    for(int j: pref)
                    {
                        if(map.containsKey(j))
                        {
                        ans+=map.get(j);
                        }
                        map.put(j,map.getOrDefault(j,0)+1);
                    }
                    System.out.println(ans);
                }

    }
}
