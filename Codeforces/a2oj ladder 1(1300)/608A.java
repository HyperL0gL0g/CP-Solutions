import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc=  new Scanner(System.in);
      int n=sc.nextInt();
      int s=sc.nextInt();
      HashMap<Integer,Integer> map= new HashMap<>();
      int[] arr =new int[s+1];
       Arrays.fill(arr,-1);
      for(int i=0;i<n;i++)
      {
          int floor=sc.nextInt();
          int time=sc.nextInt();
          arr[floor]=Math.max(arr[floor],time);
          map.put(floor,arr[floor]);
          
      }
     
      int lift_at=s;
      int time=0;
     // int floor=s;
     int i=s;
      for( i=s;i>=0;i--)
      {
          if(arr[i]==-1) // no person to come on this floor
          {
              time += lift_at - i;
              lift_at=i;
              continue;
          }
          if(i<lift_at)
      {
          time+= lift_at-i;
          lift_at=i;
      }
      if(i==lift_at)
      {
          if(map.get(i)>time)
          {
              time+=map.get(i)-time;
          }
          
      }
     //  System.out.println(time);
      }
      
      System.out.println(time);
    }
}
