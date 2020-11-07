//https://leetcode.com/problems/combination-sum/submissions/
package backtracking;

import java.util.*;

class combinationSum {
    List<List<Integer>> ans  = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        Arrays.sort(candidates);
        back(candidates ,target , new ArrayList<Integer>(),0);
        return ans;

    }
    private void back(int[] cand , int target,ArrayList<Integer> l,int start)
    {
        if(target<0)
            return ;
        if(target==0)
        {
            ans.add(new ArrayList<Integer>(l));
            return;
        }
        for(int i=start;i<cand.length;i++)
        {
            //choose
            l.add(cand[i]);
            //explore
            back(cand,target-cand[i],l,i);
            //unchoose
            l.remove(l.size()-1);
        }
    }

}