public class minCharacters {
    public static void main(String[] args) {
        min("","");
    }

    public static int min(String a, String b) {
        return Math.min(Math.min(operation1(a, b), operation1(b, a)), operation2(a, b));
    }
    // operation to make a below b
    private static int operation1(String a, String b) {

        int res   = Integer.MAX_VALUE;
        for(int i=1;i<26;i++)
        {
            int count =0;
            for(char c : a.toCharArray())
            {
                if((c-'a')>=i)
                {
                    count++;
                }
            }
            for(char c : b.toCharArray())
            {
                if((c-'a')<i)
                {
                    count++;
                }
            }
            res=Math.min(res,count);
        }

        return res;
    }

    // operation to make only one distinct letter
    private static  int operation2(String a, String b) {

        int[] A = new int[26];
        for (char c : a.toCharArray()) A[c - 'a']++;
        for (char c : b.toCharArray()) A[c - 'a']++;

        int res = 0;
        for (int i = 0; i < 26; ++i) {
            res = Math.max(res, A[i]);
        }

        return a.length() + b.length() - res;
    }
}