class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
///this is the the optimal .
//i dont i will ever be able to solve this in Log(m+n) not even in y dream even if i memorize the soln still i will make mistake in real interview.
// BEST APPROACH - DONT SOLVE THIS FUKING QUESTION.
        int m = nums1.length; 
        int n = nums2.length;

        int[] merged = new int[m+n];

        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }

        while(i<m)
            merged[k++] = nums1[i++];

        while(j<n)
            merged[k++] = nums2[j++];

        int len = m+n;

        if(len % 2 == 1)
            return merged[len/2];
        else
            return (merged[len/2] + merged[len/2 -1]) / 2.0;
    }
}