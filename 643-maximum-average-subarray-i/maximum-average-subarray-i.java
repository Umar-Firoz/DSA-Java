class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        int left=0;
        int right=k-1;
        double sum=0.0;
        double avg=0.0;
        double maxAvg=0.0;
        if(n==1){
            return (double)arr[0];
        }
        for(int i=0;i<k;i++){
            sum+=arr[i];
            maxAvg=sum/k;
        }
        if(n==k){
            return sum/k;
        }
        while(right<n-1){
            sum-=arr[left];
            left++;
            right++;
            sum+=arr[right];
            avg=sum/k;
            maxAvg=Math.max(maxAvg,avg);
        }
        return maxAvg;
    }
}