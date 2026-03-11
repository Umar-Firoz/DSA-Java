class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ss= new int[26];
        int[] st= new int[26];

         if(s.length() != t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            ss[s.charAt(i)-'a']++;
            st[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ss[i]!=st[i])
                return false;
        }
        return true;
    }
}