class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
          int n=nums.length;
        int[] ps=new int[n];
        ps[0]=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(ps[i]==k)
                c++;
            int val=ps[i]-k;
            if(map.containsKey(val)){
                c+= map.get(val);
            }
            map.put(ps[i],map.getOrDefault(ps[i],0)+1);
        }
        return c;}
}