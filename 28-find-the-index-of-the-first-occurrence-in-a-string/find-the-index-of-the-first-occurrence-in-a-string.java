class Solution {
    public int strStr(String s, String needle) {
        int l=0;
        int r=needle.length();
        if(r>s.length())return -1;
        String copy=s.substring(l,r);
        r-=1;
        while(r<s.length())
        {
            if(copy.equals(needle))
            {
                return l;
            }
            r++;
            if(r==s.length())return -1;
            copy=copy.substring(1)+s.charAt(r);
            l++;
        }
        return -1;

    }
}