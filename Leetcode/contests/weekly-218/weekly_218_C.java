class Solution {
    public int concatenatedBinary(int n) {
        
        int mod = (int)(Math.pow(10,9)+7);
        long ans=0;
        for(int i=1; i<=n;i++)
        {
            String h = Integer.toBinaryString(i);
            ans = ((ans << h.length())%mod + i%mod)%mod;
        }

        return (int)ans;
        
    }
}