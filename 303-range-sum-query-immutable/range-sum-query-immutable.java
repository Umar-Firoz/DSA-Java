class NumArray {

    int[] pa;   

    public NumArray(int[] nums) {

        pa = new int[nums.length];

        pa[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            pa[i] = pa[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {

        if(left == 0) {
            return pa[right];
        }

        return pa[right] - pa[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */