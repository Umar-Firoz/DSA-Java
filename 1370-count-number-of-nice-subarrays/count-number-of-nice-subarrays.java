class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }

    public int atmost(int[] nums, int k){
        int n=nums.length;
        int l=0;
        int c=0;
        int result=0;
        for(int r=0;r<n;r++){
            if(nums[r]%2!=0){
                c++;
            }
            while(c>k){
                if(nums[l]%2!=0)        
                    c--;
                l++;    
            }
            result+=(r-l+1);
        }
        return result;
    }
}