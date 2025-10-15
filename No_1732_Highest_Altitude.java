public class No_1732_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int sum =0;
        int max=gain[0];
        for(int i=1;i<gain.length;i++)
        {
            gain[i]=gain[i]+gain[i-1];
            if(gain[i]>max){
                max=gain[i];
            }
        }
        if(max<0)
        {
            return 0;
        }
        return max;
    }
}
