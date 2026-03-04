class Solution {
    public int mySqrt(int x) {
        int s=0;
        int e=x/2;
        if(x<=1){
            return x;
        }
        while(s<=e){
            int m=s+(e-s)/2;
            if((long)m*m == x)
                return m;
            else if((long)m*m  > x){
                e=m-1;
            }    
            else if((long)m*m  < x){
                s=m+1;
            }
        }
        return e;
    }
}