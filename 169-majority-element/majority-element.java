class Solution {
    public int majorityElement(int[] nums) {
        //Boyer–Moore Voting Algorithm
        /* Could you solve the problem in linear time and in O(1) space? -> This 
           is O(1) Space and O(n).*/
        int count =0;
        int candidate=nums[0];
        for(int i=0;i<nums.length;i++){
                if(count==0){
                    candidate=nums[i];
                }
                if(candidate==nums[i])
                    count++;
                else    
                    count--;    
        }
        return candidate;

        // can use Hashmap data set also for this but space will increase to O(n).
    }
}