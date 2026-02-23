class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int n=nums.length;
      
        return binary(nums,k)-binary(nums,k-1);
    }

    public int binary(int[] nums,int k){
         if(k < 0) return 0;
        int l=0;
        int res=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            res+=(r-l+1);
        }
        return res;
    }
}