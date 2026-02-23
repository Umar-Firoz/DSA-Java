class Solution {
    public int countCompleteSubarrays(int[] nums) {


        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int totalDistinct = set.size();

    
        return atMost(nums, totalDistinct)
             - atMost(nums, totalDistinct - 1);
    }

    public int atMost(int[] nums, int k){

        if(k < 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int result = 0;

        for(int r = 0; r < nums.length; r++){

            map.put(nums[r],
                    map.getOrDefault(nums[r], 0) + 1);

            while(map.size() > k){

                map.put(nums[l], map.get(nums[l]) - 1);

                if(map.get(nums[l]) == 0)
                    map.remove(nums[l]);

                l++;
            }

            result += (r - l + 1);
        }

        return result;
    }
}