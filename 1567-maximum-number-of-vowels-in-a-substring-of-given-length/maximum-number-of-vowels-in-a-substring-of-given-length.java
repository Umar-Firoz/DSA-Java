class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int c=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            if(max==k)
                return k;
            if(isVowel(s.charAt(r)))
            {
                c++;
            }
            if(r-l+1>k){
                 if(isVowel(s.charAt(l))){
                    c--;
                 }
                 l++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
    static boolean isVowel(char ch) {
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}