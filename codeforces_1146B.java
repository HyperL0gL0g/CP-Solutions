import java.util.Scanner;

public class codeforces_1146B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        //t=s+s`    s`=without a's s=with a's
       
      String s="";
        for(char c  : t.toCharArray() )
        {
         s+=c;
         if(t.equals(s+s.replaceAll("a","")))
         {
             System.out.println(s);
             return;
         }

         }

        System.out.println(":(");

    }
}
