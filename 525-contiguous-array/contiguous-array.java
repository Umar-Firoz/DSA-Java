class Solution {
    public  int findMaxLength(int[] nums){
    HashMap<Integer, Integer> map = new HashMap<>();
    
    int prefix = 0;
    int maxLen = 0;
    
    map.put(0, -1);   
    
    for(int i = 0; i < nums.length; i++){
        
        if(nums[i] == 0)
            prefix += -1;
        else
            prefix += 1;
        
        if(map.containsKey(prefix)){
            int length = i - map.get(prefix);
            maxLen = Math.max(maxLen, length);
        } else 
            map.put(prefix, i);  
        
    }
    
    return maxLen;
}
}