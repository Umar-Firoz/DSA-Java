class Solution {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(nums , 0 , new ArrayList<>());
        return res;
    }

    public void subset(int arr[],int s, List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=s;i<arr.length;i++){
            if(i>s && arr[i] == arr[i-1])
                continue;
            temp.add(arr[i]);
            subset(arr,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}