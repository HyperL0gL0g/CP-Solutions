class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders)
    {
     
    int i=0;
        int bricksused = 0 ;
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        
        for(i=0;i<heights.length-1;i++)
        {
            if(heights[i+1]<=heights[i])
                continue;
            
            int diff = heights[i+1]- heights[i];
             
            if(bricks>=bricksused+diff)
            {
                pq.add(diff);
                bricksused+=diff;
            }
            else if(ladders>0)
            {
                if(!pq.isEmpty() && pq.peek() >= diff)
                {
                    bricksused = bricksused - pq.peek() + diff;
                    pq.poll();
                    pq.add(diff);
                    
                }
                ladders--;
            }
        
            else break;
                  }
  
        
        return i;
    }
}