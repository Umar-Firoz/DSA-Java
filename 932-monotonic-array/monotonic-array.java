class Solution {
    public boolean isMonotonic(int[] nums) {
     int t=0;int s=0;
        //for ascending
        for (int i=0;i < nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                t=1;
                break;
            }
        }
        for (int i=0;i < nums.length-1 && t==1;i++){
            if(nums[i]<nums[i+1]){
                return false;
            }
            s=1;
        }
        if(s==1)
            return true;
        return t==0;
    }
}