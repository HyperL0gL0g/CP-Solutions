class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(char c: s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()=='b' && c=='a')
            {
               st.pop();
                ans++;
            }
            else
                st.push(c);
        }
        return ans;
        
    }
}