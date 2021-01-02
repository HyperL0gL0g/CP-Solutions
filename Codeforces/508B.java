import java.util.Scanner;
 
public class BigRecursion {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s =sc.next().toCharArray();
    int j = -1;
    int x = s[s.length-1]-'0';
    for(int i=0;i<s.length-1;i++){
      int y = s[i] - '0';
      if(y%2==0){
        j = i;
        if(y<x) break;
      }
    }
    if(j==-1) System.out.println(-1);
    else{
      char temp = s[j];
      s[j] = s[s.length-1];
      s[s.length-1] = temp;
      System.out.println(s);
    }
  }
}
