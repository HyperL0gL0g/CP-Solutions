public class B {
    public static void main(String[] args) {

    }
    public double averageWaitingTime(int[][] cust) {
        int n = cust.length;
        long chef  = cust[0][0];
        long wait=0;
        //  System.out.println(chef);
        for(int[] i  : cust)
        {
            if(chef<i[0])
                chef= i[0];
            chef+=i[1];
            //  System.out.println(chef);
            wait+=chef-i[0];
        }
        return 1.0*wait/n;
    }
}
