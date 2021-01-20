import java.util.Scanner;

public class codeforces_625B {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        String a=  sc.next();
        String b= sc.next();
        int c=0;
        if(a.contains(b))
        {
            a=a.replace(b,"#");
            for(char ch : a.toCharArray())
            {
                if(ch=='#')
                    c++;
            }
            System.out.println(c);
        }
        else
            System.out.println("0");
    }}
