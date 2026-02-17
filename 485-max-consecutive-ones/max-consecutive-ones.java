class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                l=i+1;
                
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}