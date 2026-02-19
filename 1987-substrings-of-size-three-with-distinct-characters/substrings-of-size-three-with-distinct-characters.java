class Solution {
    public int countGoodSubstrings(String s) {
        int l=0;
       
        int c=0;
        if(s.length()<3){
            return 0;
        }
        for( int r=2;r<s.length();r++){
            if(s.charAt(l)!=s.charAt(r) && s.charAt(l)!=s.charAt(l+1) && s.charAt(l+1)!=s.charAt(r))
                c++;
            l++;    
        }
        return c;
    }
}