class Solution 
{
    public int minDeletions(String s) 
    {
        int[] arr  =  new int[26];
        for(char c : s.toCharArray())
            arr[c-'a']++;
        
        PriorityQueue<Integer> pq =  new PriorityQueue<>((a,b)-> b -a);
        
        for(int i  : arr)
        {
            if(i!=0)
            {
                pq.add(i);
            }
            
        }
        
        int ans = 0;
    
        while(!pq.isEmpty())
        {
            int curr = pq.poll();
            if(pq.isEmpty())
                return ans;
            if(curr == pq.peek())
            {
                if(curr>1)
                {
                    pq.add(curr-1);
                }
                ans++;
            }
        }
        return ans;
    }
}