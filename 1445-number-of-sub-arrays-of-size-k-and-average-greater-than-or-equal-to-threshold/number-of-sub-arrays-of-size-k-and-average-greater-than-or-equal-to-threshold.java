class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int l=0;
        long sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        if((double)sum/k>=t)
            c++;
        for(int r=k;r<arr.length;r++){
            sum-=arr[l];
            sum+=arr[r];
            
            l++;
            if((double)sum/k>=t)
                c++;
        }
        return c;
    }
}