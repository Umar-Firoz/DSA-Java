class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int []arr = new int[n];
            for(int i=0;i< arr.length;i++){
                arr[i] = i+1;
            }
            subset(arr , 0 , new ArrayList<>(), k);
            return res;
    }
    public void subset(int arr[],int s, List<Integer> temp,int k){
            if(temp.size()==k){
                res.add(new ArrayList<>(temp));
                return;  }
        for(int i=s;i<arr.length;i++){
            temp.add(arr[i]);
            subset(arr,i+1,temp,k);
            temp.remove(temp.size()-1);
        }
    }
}