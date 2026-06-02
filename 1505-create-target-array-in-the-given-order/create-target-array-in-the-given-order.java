class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int ans[]=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            for(int j=s;j>index[i];j--)
            {
                ans[j]=ans[j-1];
            }      
            ans[index[i]]=nums[i]; 
            s++;    
        }
        return ans;
    }
}