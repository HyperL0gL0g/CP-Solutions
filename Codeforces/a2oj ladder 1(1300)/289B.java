import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
     Scanner sc  = new Scanner(System.in);
     int t =sc.nextInt();
     int x=sc.nextInt();
     int y=sc.nextInt();
     int destx = sc.nextInt();
     int desty = sc.nextInt();
     String  s= sc.next();
     int time = 0 ;
     int i=0;
   //  System.out.println(s);
     // char curr = s.charAt(i);
     double dist = Math.sqrt(Math.pow(destx-x,2) + Math.pow(desty-y,2) ); 
     
     while(true)
     {
          if(destx==x && desty==y)
         break;
         if(i==s.length())
         {
             System.out.println("-1");
             return;
         }
          char curr = s.charAt(i);
        
         int tx=x;
         int ty=y;
         if(curr=='N')
         y++;
          if(curr == 'S')
         y--;
          if(curr=='E')
         x++;
          if(curr == 'W')
         x--;
         double d =Math.sqrt( Math.pow(destx-x,2) + Math.pow(desty-y,2));
         if(d>dist)
         {
             x=tx;
             y=ty;
         }
         else
         {
          dist  = d;   
         }
         time++;
         i++;
      //   
       //  System.out.println(time);
     }
  //   System.out.println(x+" "+ y);
     
     if(destx==x && desty==y)
     System.out.println(time);
     else
         System.out.println("-1");
     
    }
}