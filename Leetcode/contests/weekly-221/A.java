public class A {
    public static void main(String[] args) {

    }
    public boolean halvesAreAlike(String s) {
        int l = s.length();
        String vow = "aeiouAEIOU";
        //aaaa
        int mid = l/2;
        int v=0;
        for(int i=0;i<mid;i++)
        {
            char c= s.charAt(i);
            if(vow.contains(c+""))
                v++;
        }
        for(int i=mid;i<l;i++)
        {
            char c= s.charAt(i);
            if(vow.contains(c+""))
                v--;
        }
        if(v==0)
            return true;
        return false;


    }
}

