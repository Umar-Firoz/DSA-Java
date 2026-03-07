class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int s=1;
        int e=max(arr);
        while (s<e){
            int m=s+(e-s)/2;
            if(check(arr,m,t))
                e=m;
            else
                s=m+1;
        }
        return s;
    }
      static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }
      static int max(int[] arr){
        int max=0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
    // static int product(int[] arr){
    //     int p=1;
    //     for (int i : arr) {
    //         p*=i;
    //     }
    //     return p;
    // }
    static boolean check(int []arr, int k,int t){
        int sum=0;
        for(int i:arr){
            sum+=((i+k-1)/k);
        }
        return sum<=t;
    }
}