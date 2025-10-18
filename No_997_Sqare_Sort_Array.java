class No_997_Sqare_Sort_Array {
    public int[] sortedSquares(int[] nums) {
        int[] ans= new int [nums.length];
        int i=0;int j=nums.length-1;
        for(int s=nums.length-1;s>=0;s--)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                ans[s]=nums[i]*nums[i];
                i++;
            }
            else{
                ans[s]=nums[j]*nums[j];
                j--;
            }
        }
        return ans;
        }
    }
