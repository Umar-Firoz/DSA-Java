class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        Arrays.sort(can);
        sum(can,target,0,new ArrayList<>());
        
        return result;
    }
    void sum(int[] nums,int target,int s,List<Integer> temp){
        

    if(target == 0){
        result.add(new ArrayList<>(temp));
        return;
    }

    if(target < 0){
        return;
    }

    for(int i=s;i<nums.length;i++){
        if(i>s && nums[i]==nums[i-1])
            continue;

        temp.add(nums[i]);

        sum(nums,target-nums[i],i+1,temp);

        temp.remove(temp.size()-1);
        }
    }
}