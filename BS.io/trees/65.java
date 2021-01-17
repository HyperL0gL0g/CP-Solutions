import java.util.*;


class Solution {
    public int solve(Tree root) {
        if(root==null)
        return 0;
    Queue<Tree> q = new LinkedList<>();
    q.add(root);
    Tree r=null;
    while(!q.isEmpty())
    {
            r=q.poll();
            if(r.right!=null)
            q.add(r.right);
            if(r.left!=null)
            q.add(r.left);
    }
    return r.val;

        
    }
}
