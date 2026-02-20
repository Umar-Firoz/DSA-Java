class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for(int i =0;i<= s.length() - k;i++){
            String sub = s.substring(i,i+k);
            int subNum = Integer.parseInt(sub);
            if(subNum != 0 && num % subNum == 0){
                count ++;
            }

        }

        return count;
    }
}