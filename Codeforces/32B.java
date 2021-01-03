import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner sc= new Scanner(System.in);
    String s =sc.next();
  int n=s.length();
    String ans="";
    Stack<Character> st = new Stack<>();
    for(int i=n-1 ;i>=0;i--)
    st.push(s.charAt(i));
    
    while(!st.isEmpty())
    {
        char curr = st.pop();
        if(curr=='.')
        {
            ans+="0";
        }
        else if (curr=='-')
        {
            if(!st.isEmpty() && st.peek()=='-')
            {
            ans+="2";
            st.pop();
            }
            else if(!st.isEmpty() && st.peek()=='.')
            {
            ans+="1";
            st.pop();
            }
            
        }
    }
    System.out.println(ans);
    }
}
    