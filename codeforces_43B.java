import java.util.Scanner;

public class codeforces_43B {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String text=sc.nextLine();
        String my=sc.nextLine();
        int[] arr= new int[128];
        for(char c : text.toCharArray())
            arr[c]++;
        for(char c  : my.toCharArray())
        {
            if(c==' ')
                continue;
            arr[c]--;
        }
        for(int i : arr)
        {
            if(i<0)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
