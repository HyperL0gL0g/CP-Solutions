public class C {
    public static void main(String[] args) {

    }
    public String maximumBinaryString(String binary) {
        int ones=0,zeros=0,starting=0;
        char[] arr = binary.toCharArray();
        StringBuilder sb =new StringBuilder();
        int n=binary.length();
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='1')
                starting++;
            else
                break;
        }

        for(int i=starting;i<n;i++)
        {
            if(arr[i]=='1')
                ones++;
            else
                zeros++;
        }

        for(int i=0;i<starting;i++)
            sb.append('1');
        for(int i=0;i<zeros-1;i++)
            sb.append('1');
        if(zeros>0)
            sb.append('0');

        for(int i=0;i<ones;i++)
            sb.append('1');


        return sb.toString();

    }
}
