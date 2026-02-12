class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
           int r1=m-1;
    int r2=n-1;

    while(r2>=0){
        if(r1>=0 && nums1[r1]>=nums2[r2]){
            nums1[r1+r2+1]=nums1[r1--];

        }
        else {
            nums1[r1+r2+1]=nums2[r2--];

        }
     }
    }
}