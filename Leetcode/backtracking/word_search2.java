class Solution {
    List<String> ans  =  new ArrayList<String>();
    
    public List<String> findWords(char[][] board, String[] words) {
        
      outer:  for(String s  :  words)
        {
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[0].length;j++)
                {
                    if(s.charAt(0)==board[i][j])
                    {
                        if(back(board,s,i,j,0))
                        {
                            ans.add(s);
                            continue outer;
                        }
                    }
                }
            }
      }
        return ans;
    }
    private boolean back(char[][] board ,String s , int i, int j ,int index)
    {
        if(index==s.length())
            return true;
        if(i<0 || j<0 || i==board.length || j==board[0].length || board[i][j]=='^')
            return false;
        if(board[i][j]!=s.charAt(index))
            return false;
    
        char t =  board[i][j];
        board[i][j]= '^';
        boolean c = ( back(board,s,i+1,j,index+1) || back(board,s,i-1,j,index+1) || back(board,s,i,j+1,index+1) || back(board,s,i,j-1,index+1) ) ;
        board[i][j] = t;
        return c;
            
    }
}
        
            
            
            
            
            
      