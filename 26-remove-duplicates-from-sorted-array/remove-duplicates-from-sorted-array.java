class Solution {
    public int removeDuplicates(int[] arr) {
         int left=1;int count =1;
        for(int right=1;right<arr.length;right++){

            if(arr[right]!=arr[right-1]){
                arr[left]=arr[right];
                left++;
                count++;
        }
     }
     return count;
 }
}
