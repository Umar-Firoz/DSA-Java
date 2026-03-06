class Solution {
    public int singleNonDuplicate(int[] arr) {
      int s=0;
      int l= arr.length;
      int e=arr.length-1;
      while (s<=e)
      {
          int m= s+(e-s)/2;
          int lb=lowerBound(arr, arr[m]);
          int up=upperBound(arr,arr[m]);
          if(up-lb==1) {
              return arr[m];
          }
          else{
              if((l-up)%2==0){
                  e=lb-1;
              }
              else{
                  s=up;
              }
              l=e-s+1;
          }
      }
      return -1;
    }
    static int lowerBound(int[] nums, int target){
        int s = 0, e = nums.length;

        while(s < e){
            int m = s + (e - s)/2;

            if(nums[m] < target)
                s = m + 1;
            else
                e = m;
        }
        return s;
    }

    static int upperBound(int[] nums, int target){
        int s = 0, e = nums.length;

        while(s < e){
            int m = s + (e - s)/2;

            if(nums[m] <= target)
                s = m + 1;
            else
                e = m;
        }
        return s;
    }
}