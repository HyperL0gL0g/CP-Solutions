import java.util.Scanner;

public class codeforces_1278A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

     outer:    while (t-- > 0) {
            String p = sc.next();
            String h = sc.next();
            if(h.length()<p.length())
            {
                System.out.println("NO");
                continue;
            }
            //one  == p
            //wwonett  == h
            String s= h.substring(0,p.length());

            //System.out.println(s);

            StringBuilder sb = new StringBuilder(s);
         if(ana(sb.toString(),p))
         {
             System.out.println("YES");
             continue outer;
         }
          int l=0;
          int ho=p.length();
           while(ho<h.length())
           {
               sb.deleteCharAt(0);

               sb.append(h.charAt(ho));
               if(ana(sb.toString(),p))
               {
                   System.out.println("YES");
                   continue outer;
               }

               ho++;



            }
            System.out.println("NO");

        }

    }
private  static boolean ana(String a , String b)
{
    int[] ch=new int[26];
    for(char c : a.toCharArray())
        ch[c-'a']++;
    for(char c:  b.toCharArray() )
        ch[c-'a']--;
    for(int i :  ch)
        if(i!=0)
            return false;
return true;
}

}
