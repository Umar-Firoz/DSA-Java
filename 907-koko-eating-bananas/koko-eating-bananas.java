class Solution {
    public int minEatingSpeed(int[] arr, int hours) {
        int s=1;
        int e=max(arr);
        while (s<e){
            int m=s+(e-s)/2;
            if(check(arr,m,hours))
                e=m;
            else
                s=m+1;
        }
        return s;
    }
    static int max(int[] arr){
        int max=0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
       static boolean check(int[] arr,int k,int hours){
        int h=0;
        for(int i : arr){
            h+=(i+k-1)/k;
            // if(i<=k)
            //     h+=1;
            // else
            //     h+= (int) Math.ceil((double)i / k);
        }
        return h <= hours;
    }
}