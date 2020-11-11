//backtracking

class Solution {
    int ans=0;
    public int uniquePathsWithObstacles(int[][] g)
    {
        back(g,0,0);
        return ans;
    }
    private void back(int[][] g , int i, int j )
    {
        if(i==g.length-1 && j==g[0].length-1 && g[i][j]!=1)
        {
            ans++;
            return ;
        } 
        if(i<0 || j<0 || i==g.length || j==g[0].length || g[i][j]==1 || g[i][j]==-1)
            return ;
        int t = g[i][j];
        g[i][j]=-1;
        back(g,i+1,j);
        back(g,i,j+1);
        g[i][j]=t;
    }
    
}
        
//DP
class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        if(g[0][0]==1)
            return 0;
        g[0][0]=1;
        
        for(int i=1;i<g.length;i++)
        {
            if(g[i][0]==0 && g[i-1][0]==1)
                g[i][0]=1;
            else
                g[i][0]=0;
        }
        for(int i=1;i<g[0].length;i++)
        {
            if(g[0][i]==0 && g[0][i-1]==1)
                g[0][i]=1; 
            else
                g[0][i]=0;
        }
        for(int i=1;i<g.length;i++)
        {
            for(int j=1;j<g[0].length;j++)
            {
                if(g[i][j]==0)
                {
                    g[i][j]=g[i-1][j]+g[i][j-1];
                }
                else
                    g[i][j]=0;
            }
        }
        return g[g.length-1][g[0].length-1];
        
    }
}