import java.util.*;

class Solution {
    int ans=0;
    public int solve(Tree root) {
        help(root);
        return ans;
    }
    private void help(Tree root)
    {
        if(root==null)
        return;
        if(root.left==null && root.right!=null   || root.right==null && root.left!=null  )
        ans++;
        help(root.left);
        help(root.right);

    }
}