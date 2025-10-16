class No_1295_Even_number_Digits{
   public int findNumbers(int[] nums) {
        int count = 0;
        for(int x : nums){
            if((int) (1+ Math.log10(x))%2 ==0) {
                count++;
            }
        }
        return count;
    }
}
