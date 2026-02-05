class Solution {
   public int[] runningSum(int[] nums) {
        int sum = 0;
        int arr[] = new int[nums.length];
        int j = 0;
        for (int i : nums) {
            sum += i;
            arr[j++] = sum;
        }
        return arr;
    }
}