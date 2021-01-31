import  java.util.*;
public class A {
    public static void main(String[] args) {
            maximumUnits(new int[1][],5);
    }
    public  static int maximumUnits(int[][] boxTypes, int truckSize)
    {
        Arrays.sort(boxTypes , (a,b)->b[1]-a[1]);
        int ans=0;
        //  System.out.println(Arrays.deepToString(boxTypes));
        for(int[]  i : boxTypes)
        {
            if(i[0] <= truckSize){
                ans+=i[0]*i[1];
                truckSize-=i[0];
            }
            else
            {
                while(truckSize>0 && i[0]>0)
                {
                    truckSize-=1;
                    i[0]-=1;
                    ans+=i[1];
                }
            }
            //System.out.println(truckSize);
        }
        return ans;

    }
}
