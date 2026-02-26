class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         int n=nums.length;
        int[] ps=new int[n];
        ps[0]=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        int c=0;
        for(int i=0;i<n;i++){
            int rem=ps[i]%k;
            if(rem==0)
                c++;
             if(rem< 0)
                rem += k;    
            if(map.containsKey(rem))
            {
                c+= map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return c;
    }
}