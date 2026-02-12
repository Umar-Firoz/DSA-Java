class Solution {
    public int maxProfit(int[] arr) {
          int l=0;
        int r=1;
        int max=0;
        while(r< arr.length){
            if(arr[l]>=arr[r]){
                l=r;
            }
            else{
                max=Math.max(max,arr[r]-arr[l]);
            }
            r++;
        }
        return max;
    }
}