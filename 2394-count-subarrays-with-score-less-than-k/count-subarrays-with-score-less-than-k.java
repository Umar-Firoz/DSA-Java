class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0;
        long p=1;
        long count=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            p=sum*(r-l+1);
            while(l<=r && p>=k){
                sum-=nums[l];
                l++;
                p=sum*(r-l+1);
            }
            count+=(r-l+1);
        }
        return count;
    }
}