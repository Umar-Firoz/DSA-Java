class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left=0;
        int n=arr.length;
        int right = n - 1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(arr[left]+arr[right]==target)
                return new int[]{left+1, right+1};
            else if(sum<target)
                left++;
            else
                right--;        
        }
        return new int[]{-1,-1};
    }
}