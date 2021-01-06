		import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String s  = sc.next();
    Stack<Character> st = new Stack<>();
    for(char c :s.toCharArray())
    st.push(c);
    int  count=0;
    char c=st.pop();
    while(!st.isEmpty())
    {
      
        if(c==st.peek())
        count++;
        c=st.pop();
    }
 
    System.out.println(count);
    }
}
    