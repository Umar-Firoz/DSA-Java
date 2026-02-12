class Solution {
    public int[] applyOperations(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
            arr[i]=nums[i];
        }
        arr[arr.length-1]=nums[nums.length-1];
            int l=0;
            for(int r=0;r<arr.length;r++){
                if(arr[r]!=0){
                    int temp=arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                    l++;
                }
            }
            return arr;
        }   
    }
