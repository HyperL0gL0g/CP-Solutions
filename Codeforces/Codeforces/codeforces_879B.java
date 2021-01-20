import java.util.*;

public class codeforces_879B {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n= sc.nextInt();
        long k=sc.nextLong();
        LinkedList<Integer> arr= new LinkedList<>();
        HashMap<Integer,Long>  map = new HashMap<>();
        for(int i  =0;i<n;i++)
        {
            int e=sc.nextInt();
            arr.add(e);
            map.put(e,0L);
        }
       // System.out.println(arr);

       while(true){
           for(int i =0;i<arr.size();)
           {
             int first =arr.get(i);
             int sec=arr.get(i+1);
              if( map.get(first)>=n || (map.get(first)>=k))
               {
                   System.out.println(first);
                   return;
               }

               if(first>sec)
               {
                   int t=sec;
                   arr.remove((Integer)t);
                   arr.add(t);
                   map.put(first,map.getOrDefault(first,0L)+1);
               }
               else if(sec>first){
                   int l=first;
                   arr.remove((Integer)l);
                   arr.add(l);
                   map.put(sec,map.getOrDefault(sec,0L)+1);
               }
              // System.out.println(map);

           }
       }












    }
}
