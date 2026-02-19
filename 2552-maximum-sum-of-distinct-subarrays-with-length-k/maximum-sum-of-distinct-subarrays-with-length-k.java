class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int l = 0;
        long max = 0;     // changed to long
        long sum = 0;     // changed to long

        if (nums.length < k) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {

            if (!map.containsKey(nums[r])) {
                sum += nums[r];
            }

            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Frequency Removal
            while (r - l + 1 > k) {
                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                    sum -= nums[l];
                }

                l++;
            }

            if (map.size() == k) {
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}