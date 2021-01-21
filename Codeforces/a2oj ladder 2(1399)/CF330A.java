import java.util.*;
public class CF330A
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][] arr =new char[r][c];
        for(int i=0;i<r;i++)
        {
            String s= sc.nextLine();
            for(int j=0;j<c;j++){
                arr[i][j]=s.charAt(j);
            }
        }



    }
}