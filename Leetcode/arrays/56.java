class Solution {
    public int[][] merge(int[][] intervals) 
    {    
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
     //   System.out.println(Arrays.deepToString(intervals));
    //   return intervals;
        List<int[]> l = new ArrayList<>();
        for(int[] i  : intervals)
        {
         if(l.size()==0 || l.get(l.size()-1)[1] < i[0] )//no overlap
             l.add(i);
            else
                l.get(l.size()-1)[1]= Math.max(i[1],l.get(l.size()-1)[1]);
        }
        
        int[][] ans = new int[l.size()][2];
        for(int i=0;i<l.size();i++)
        {
            ans[i][0]=l.get(i)[0];
            ans[i][1]=l.get(i)[1];
        }
       
        return ans;
        
    }
}