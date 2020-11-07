class Solution {
    List<List<Integer>> ans  = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums)
    {
         back(nums , new ArrayList<Integer>(),0);
        return ans;
    }
    private void back(int[] nums ,ArrayList<Integer> l,int start )
        {
        
            ans.add(new ArrayList<>(l));
        
            for(int i =start; i<nums.length;i++)
            {
                l.add(nums[i]);
                back(nums,l,i+1);
                l.remove(l.size()-1);
                
            }
        }
        
    }
