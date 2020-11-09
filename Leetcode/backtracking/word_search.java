package backtracking;
//https://leetcode.com/problems/word-search
class word_search {
    public boolean exist(char[][] board, String word)
    {
        System.out.println();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(back(board,i,j,word,0))
                        return true;
                }
            }
        }
        return false;

    }

    private boolean back(char[][] board , int i, int j,String w , int curr)
    {
        if(curr==w.length())
            return true;
        //out of bounds
        if(i<0 || i==board.length || j<0 || j==board[0].length || board[i][j]=='&')
            return false;
        //no match
        if(w.charAt(curr)!=board[i][j])
            return false;

        char t = board[i][j];
        boolean ans=true;
        //choose
        board[i][j]='%';
        //explore
        ans = (back(board, i+1,j,w,curr+1) || back(board, i-1,j,w,curr+1) || back(board, i,j+1,w,curr+1) || back(board, i,j-1,w,curr+1) );
        //unchoose
        board[i][j] =  t;

        return ans;

    }




}