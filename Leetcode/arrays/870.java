class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int n=A.length;
        Arrays.sort(A);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int[] ans = new int[n];
        
        for(int i=0;i<n;i++)
            pq.add(new int[]{B[i],i});
        
        int l=0,h=n-1;
    
        while(!pq.isEmpty())
        {
            int[] a = pq.poll(); //B
            int val = A[h];//largest A value
            if(val > a[0]) // if largest A > largest B
                ans[a[1]]=A[h--];
            
            else
                ans[a[1]]=A[l++];
        }
        return ans;
    }
}