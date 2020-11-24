class Solution {
    public int minimumEffort(int[][] tasks) {
        int ans =  0;
        Arrays.sort(tasks,(a,b)-> (b[1]-b[0]) -(a[1]-a[0]));
        int saved=0;
        for(int[] i :  tasks)
        {
            if(i[1]>saved)
            {
                ans+=i[1]-saved;
                saved = i[1]-i[0];
            }
            else
                saved-=i[0];
        }
        return ans;
        
    }
}