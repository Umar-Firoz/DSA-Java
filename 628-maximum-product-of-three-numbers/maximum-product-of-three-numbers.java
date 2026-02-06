class Solution {
    public int maximumProduct(int[] arr) {
        int m1=-1111;int m2=-1111;int m3=-1111;
        int pC1=1;

        // Case 1 : product od three largest number
        for(int l : arr){
            if(l >m1){
                m3=m2;
                m2=m1;
                m1= l;
            }
            else if(l >m2  ){
                m3=m2;
                m2= l;
            } else if (l >m3 ) {
                m3= l;
            }
        }
        pC1=m1*m2*m3;

         // Case 2 : product of 2 smallest + 1 largest
        int s1=1111;
        int s2=1111;
        int pC2=1;
        for(int s : arr){
            if(s<s1){
                s2=s1;
                s1=s;
            }
            else if(s < s2 ){
                s2=s;
            }
        }
        pC2=s2*s1*m1;
        return Math.max(pC1,pC2);
    }
}