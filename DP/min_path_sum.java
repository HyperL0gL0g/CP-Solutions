//backtracking

class Solution 
{
    int ans = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid)
    {
        back(grid,0,0,0);
        return ans;        
    }
    
    private void back(int[][] grid  ,  int i , int j , int sum)
    {
        if(i==grid.length-1 && j==grid[0].length-1)
        {
            ans=Math.min(ans,sum+grid[grid.length-1][grid[0].length-1]);
            return;
        }
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==-1)
            return ;
      // System.out.println(grid[i][j]);
        sum+=grid[i][j];
        int t = grid[i][j];
        //choose
        grid[i][j]=-1;
        back(grid , i+1,j,sum);
        back(grid,i,j+1,sum);
        grid[i][j]=t;
        
    }
    
}

// dp memoisation

class Solution
{
    
    public int minPathSum(int[][] grid) {
        int[][] dp  = new int[grid.length][grid[0].length];
     for(int i=0;i<grid.length;i++)
     {
         for(int j=0;j<grid[0].length;j++)
         {
             if(i==0 && j==0)
                 dp[i][j]=grid[i][j];
             else if(i==0 && j!=0)
                 dp[i][j]=dp[i][j-1]+grid[i][j];
             else if(j==0 && i!=0)
                 dp[i][j]=dp[i-1][j]+grid[i][j];
             else
                 dp[i][j]= grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
         }
     }
        return dp[grid.length-1][grid[0].length-1];
      
      
        
    }
}