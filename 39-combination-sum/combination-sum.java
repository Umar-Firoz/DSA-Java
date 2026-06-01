class Solution {

    List<List<Integer>> result=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] can, int target) {
        sum(can,target,0,new ArrayList<>());
        return result;
    }

    void sum(int[] nums,int target,int start,List<Integer> temp){

    if(target == 0){
        result.add(new ArrayList<>(temp));
        return;
    }

    if(target < 0){
        return;
    }

    for(int i=start;i<nums.length;i++){

        temp.add(nums[i]);

        sum(nums,target-nums[i],i,temp);

        temp.remove(temp.size()-1);
    }
}
}