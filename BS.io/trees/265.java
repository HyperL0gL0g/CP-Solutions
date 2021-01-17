import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root) {
        boolean l = root.left==null || root.val==root.left.val && solve(root.left);
        boolean r = root.right==null || root.val==root.right.val && solve(root.right);
        return l&& r;
    }
}