class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int c=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u')
            {
                c++;
            }
            if(r-l+1>k){
                 if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u'){
                    c--;
                 }
                 l++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}