class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);

        if(first == nums.length || nums[first] != target)
            return new int[]{-1, -1};

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

    static int lowerBound(int[] nums, int target){
        int s = 0, e = nums.length;

        while(s < e){
            int m = s + (e - s)/2;

            if(nums[m] < target)
                s = m + 1;
            else
                e = m;
        }
        return s;
    }

    static int upperBound(int[] nums, int target){
        int s = 0, e = nums.length;

        while(s < e){
            int m = s + (e - s)/2;

            if(nums[m] <= target)
                s = m + 1;
            else
                e = m;
        }
        return s;
    }
}