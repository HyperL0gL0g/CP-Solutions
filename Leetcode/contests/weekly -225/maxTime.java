class maxTime {
    public static void main(String[] args) {
        System.out.println(maximumTime("23:??"));
    }

    public  static String maximumTime(String time) {
        String[] arr = time.split(":");
        String hr = arr[0];
        String min = arr[1];
        //hrs
        char a0 = hr.charAt(0)=='?' && (hr.charAt(1)=='?' || Character.getNumericValue(hr.charAt(1))<=3 ) ? '2':  hr.charAt(0)=='?' && (hr.charAt(1)!='?' || Character.getNumericValue(hr.charAt(1))>3 ) ? '1': hr.charAt(0);

        int hr1=Character.getNumericValue(a0);
        char a1  = hr.charAt(1)=='?' ? (hr1==0||hr1==1 ? '9' : '3')  :hr.charAt(1);

        //mins
        char min0 = min.charAt(0)=='?'?'5' : min.charAt(0);
        int min1= Character.getNumericValue(min0);
        char min2 =  min.charAt(1)=='?'? '9': min.charAt(1);


        return (a0+""+a1+":"+min0+""+min2+"");

    }
}