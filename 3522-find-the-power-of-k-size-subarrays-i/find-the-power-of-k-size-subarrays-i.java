class Solution {
public int[] resultsArray(int[] nums, int k) {

    int n = nums.length;

    if (k == 1) return nums;

    int[] result = new int[n - k + 1];

    int streak = 1;   // length of current consecutive ascending chain

    for (int i = 1; i < n; i++) {

        if (nums[i] == nums[i - 1] + 1) {
            streak++;
        } else {
            streak = 1;
        }

        if (i >= k - 1) {
            if (streak >= k)
                result[i - k + 1] = nums[i];
            else
                result[i - k + 1] = -1;
        }
    }

    return result;
}
}