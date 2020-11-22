class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>  l = new ArrayList<>();
        
        
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1); 
        }
        
        for(int i : nums)
            l.add(i);
        
        Collections.sort(l  ,  (a,b)->map.get(a)==map.get(b)? b-a : map.get(a)-map.get(b));
       // System.out.println(l);
        return l.stream().mapToInt(i -> i).toArray();
        
        
    }
}