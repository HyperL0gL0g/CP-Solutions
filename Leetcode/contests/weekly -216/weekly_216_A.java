class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String a="",b="";
        for(String s : word1)
            a+=s;
         for(String s : word2)
            b+=s;
        
        return a.equals(b);
    }
}