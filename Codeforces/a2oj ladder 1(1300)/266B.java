import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int t= sc.nextInt();
    String s = sc.next();
    char[] arr = s.toCharArray();
    int l=arr.length;
    while(t-- > 0)
    {
        for(int i=0;i<l-1;i++)
        {
            if(arr[i]=='B' && arr[i+1]=='G')
            {
                    arr[i]='G';
                    arr[i+1]='B';
                    i++;
            }
        }
        
    }
    System.out.println(arr);
        
        
    }
}