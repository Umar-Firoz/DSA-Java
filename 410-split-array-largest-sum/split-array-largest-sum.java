class Solution {
    public int splitArray(int[] arr, int k) {
        int s=max(arr);
        int e=sum(arr);
        while(s<e){
            int m=s+(e-s)/2;
            if(check(arr,m,k))
                e=m;
            else
                s=m+1;
        }
        return s;
    }
     static int sum(int[] arr){
        int sum=0;
        for (int i : arr) {
           sum+=i;
        }
        return sum;
    }
  static int max(int[] arr){
        int max=0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
    static boolean check(int[] arr,int m,int k){
        int d=1;int sum=0;
        for(int i : arr){

           if(sum+i>m) {
               d ++;
               sum = 0;
           }
           sum+=i;
        }
        return d <= k;
    }
}