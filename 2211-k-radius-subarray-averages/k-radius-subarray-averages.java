class Solution {
    public int[] getAverages(int[] nums, int k) {

        int[] arr = new int[nums.length];
        int l = 0;
        long sum = 0;   
        int avg = 0;

        if (2*k + 1 > nums.length) {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = -1;
            }
            return arr;
        }

        if (k == 0) {
            return nums;
        }

        for (int i = 0; i < 2*k + 1; i++) {
            sum += nums[i];
        }

        avg = (int)(sum / (2*k + 1));  

        for (int r = 0; r < nums.length; r++) {

            if (r - k < 0) {
                arr[r] = -1;
            }

            if (r + k >= nums.length) {
                arr[r] = -1;
            }

            if (r - k >= 0 && r + k < nums.length) {

                arr[r] = avg;

                sum -= nums[l];

                if (r + k + 1 < nums.length)   
                    sum += nums[r + k + 1];

                l++;

                avg = (int)(sum / (2*k + 1));   
            }
        }

        return arr;
    }
}