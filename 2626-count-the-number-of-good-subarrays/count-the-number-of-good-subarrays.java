class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        long result=0;
        int c=0;
        int n=nums.length;
        for(int r=0;r<n;r++)
        {   c += map.getOrDefault(nums[r], 0);

             map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            
            while(c>=k){
                result+=(n-r);
                map.put(nums[l], map.get(nums[l]) - 1);
                   c -= map.get(nums[l]);
                  if (map.get(nums[l]) == 0)
                  {
                     map.remove(nums[l]);
                  }    
                l++;
            }
           
        }
         return result;
    }
}