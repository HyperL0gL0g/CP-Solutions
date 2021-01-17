import java.util.*;

class Solution {
    public boolean solve(Tree root) {
        if(root==null)
        return true;
        return back(root.left,root.right);
        
    }
    private boolean back(Tree root1, Tree root2)
    {
        if(root1==null || root2==null)
        return root1==root2;
        return root1.val==root2.val && back(root1.left,root2.right) && back(root1.right,root2.left);
    }
}