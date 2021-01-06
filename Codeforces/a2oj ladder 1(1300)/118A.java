import java.util.*;
public class MyClass {
    
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
    String s= sc.next();
   s=s.replaceAll("[AEIOUYaeiouy]","");
  // System.out.println(s);
  String  s2=s.toLowerCase();
  if(s2.length()==0)
  {
      System.out.println("");
      return;
  }
  String ans=".";
  for(char c   : s2.toCharArray())
  {
      ans+= c;
      ans+='.';
  }
  System.out.println(ans.substring(0,ans.length()-1));
   
    }
}