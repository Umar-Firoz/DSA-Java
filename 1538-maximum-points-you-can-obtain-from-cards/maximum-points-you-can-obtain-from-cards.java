class Solution {
    public int maxScore(int[] arr, int k) {
             int maxSum=0;
          int lm_left=0;
          int n= arr.length;
          int lm_right=k-1;
          int sum=0;
          int rm_right=n-1;
          int rm_left=n-k;

          for(int i=0;i<k;i++){
              sum+=arr[i];
          }
             maxSum=sum;
          if(n==k){
              return sum;
          }

          while(lm_right>=0 && rm_right>=rm_left){
              sum-=arr[lm_right];
              lm_right--;
              sum+=arr[rm_right];
              rm_right--;
              maxSum=Math.max(sum,maxSum);
          }


          return maxSum;
    }
}