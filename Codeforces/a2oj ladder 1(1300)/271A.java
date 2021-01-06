import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc= new Scanner(System.in);
   int y =sc.nextInt();
   
   while(true)
   {
       y+=1;
       HashSet<Character> set = new HashSet<>();
       char[] arr= (y+"").toCharArray();
       for(char c: arr)
       set.add(c);
       if(set.size()==arr.length)
       {
           System.out.println(y);
           break;
       }
   }
    }
}