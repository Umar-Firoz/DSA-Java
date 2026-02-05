class Solution {
   static int count(int n){
        return (int)(Math.log10(n)+1);
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            if(count(i)%2==0)
            
                c++;
            
        }
    return c;
    }
}