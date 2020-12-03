class Solution {
    public int minimumDeviation(int[] nums) {
        int min = Integer.MAX_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums)
        {
            if(i%2!=0)
                i=i*2;
            pq.add(i);
            min = Math.min(min , i);
        }
        int ans = Integer.MAX_VALUE;
        while(pq.peek()%2==0)
        {
         ans = Math.min(ans, pq.peek()- min);
            min = Math.min(min, pq.peek()/2);
            pq.add(pq.poll()/2);     
        }
        return Math.min(ans ,  pq.peek() -  min);
        
    }
}