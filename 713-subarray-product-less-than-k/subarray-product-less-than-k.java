class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    
  int n = nums.length;
        long prod = 1;
        int start = 0, end = 0;
        int count = 0;

        while (end < n) {
            // 1) expand window by including nums[end]
            prod *= nums[end];

            // 2) shrink from the left as long as product >= k
            while (start <= end && prod >= k) {
                prod /= nums[start];
                start++;
            }

            // 3) now all subarrays ending at `end` and starting anywhere from
            //    start to end have product < k
            count += (end - start + 1);

            // 4) move right pointer
            end++;
        }

        return count;
    }
}