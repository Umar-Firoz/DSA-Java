class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=nums[0];
        long result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=max)  
                max=nums[i];
        }
        int l=0;
        int c=0;
        for(int r=0;r<n;r++){
            if(nums[r]==max){
                c++;
            }
            while(c>k-1){
                if(nums[l]==max)
                    c--;
                l++;    
            }
            result+=(r-l+1);
        }
        long total = (long)n * (n + 1) / 2;
        return total-result;
    }
}