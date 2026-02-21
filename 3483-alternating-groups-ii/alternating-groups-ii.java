class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] arr=new int[colors.length+k-1];
        for(int i=0;i<arr.length;i++){
            if(i>=colors.length){
                arr[i]=colors[i-colors.length];
            }
            else{
                arr[i]=colors[i];
            }
        }
        int l=0;
        int track=0;
        int count=0;
        for(int r=1;r<arr.length;r++){
            if(arr[r]!=arr[r-1]){
                track++;
            }
            else{
                track=0;
            }
            if(r-l+1>=k){
                if(track>=k-1){
                    count++;
                }
                l++;
            }
        }
        return count;
    }
}