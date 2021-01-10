import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 =sc.nextLine();
     s1=s1.replaceAll("\\s","");
    String t1 = sc.nextLine();
     t1=t1.replaceAll("\\s","");
    //can we make t1 from s1 (only use each character once in s1 )
    int[] arr = new int[256];
   
   
   //  System.out.println(s1);
     // System.out.println(t1);
    for(char c  : s1.toCharArray())
    arr[c]++;
    for(char c : t1.toCharArray())
    arr[c]--;
  // System.out.println(Arrays.toString(arr));
    for(int i  :arr)
    {
        if(i<0)
        {
            System.out.println("NO");
          //  System.out.println(i);  
            return;
        }
    }
     System.out.println("YES");
    }
}