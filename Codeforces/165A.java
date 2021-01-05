import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int[][] points = new int[n][2];
     for(int i=0;i<n;i++)
     {
         points[i][0]=sc.nextInt();
         points[i][1]=sc.nextInt();
     }
     int ans=0;
    outer: for(int i=0;i<n;i++)
     {
         int currx=points[i][0];
         int curry = points[i][1];
         int l=0,u=0,d=0,r=0;
         for(int j=0;j<n;j++)
         {
             int x=points[j][0];
             int y=points[j][1];
             if(x==currx && y==curry)
             continue;
          if(x>currx && y==curry)
          r++;
         else if(x<currx && y==curry)
          l++;
         else if(y>curry && x==currx)
          u++;
          else if(y<curry && x==currx)
          d++;
          if(l>0 && u>0 && d>0 && r>0)
          {
          ans++;
          continue outer;
          }
         }
     }
     
     System.out.println(ans);
    }
}