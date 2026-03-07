class Solution {
    public int shipWithinDays(int[] arr, int days) {
               int s=max(arr);
        int e=sum(arr);
        while (s<e){
            int m=s+(e-s)/2;
            if(check(arr,m,days))
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
     static int sum(int[] arr){
        int sum=0;
        for (int i : arr) {
           sum+=i;
        }
        return sum;
    }
    static boolean check(int[] arr,int k,int days){
        int d=1;int sum=0;
        for(int i : arr){

           if(sum+i>k) {
               d ++;
               sum = 0;
           }
           sum+=i;
        }
        return d <= days;
    }
}