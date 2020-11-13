//uncomment the lines for better understanding
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        back(ans , new ArrayList<>() , nums);
        return ans;
    }
    
    private static void back(List<List<Integer>> ans , ArrayList<Integer> l , int[] nums)
    {
        if(l.size()==nums.length)
        {
           // System.out.println("List formed= "+ l);
            ans.add(new ArrayList<>(l));
        }
        for(int i=0 ; i<nums.length;i++)
        {
            if(l.contains(nums[i]))
               continue;
            //   System.out.println("before adding= "+ l);
            l.add(nums[i]);
              // System.out.println("after adding= "+ l);
            back(ans,l,nums);
            l.remove(l.size()-1);
              // System.out.println("after removing= "+ l);
        }
    }
}