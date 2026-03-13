class Solution {
    public int strStr(String haystack, String needle) {
        int r=needle.length();
        int l=0;
        while(r<=haystack.length())
        {
            if(haystack.substring(l,r).equals(needle)){
                return l;
            }
            l++;
            r++;
        }
        return -1;
    }
}