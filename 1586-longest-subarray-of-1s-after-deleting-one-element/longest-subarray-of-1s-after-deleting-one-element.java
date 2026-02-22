class Solution {
    public int longestSubarray(int[] nums) {
        int z=0;
        int l=0;
        int r=0;
        int max=0;
        while(r<nums.length){
            if(nums[r]==0)
            {
                z++;
            }
            if(z>1){
                if(nums[l]==0)
                    z--;
                l++;    
            }
            if(z<=1){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max-1;
    }
}