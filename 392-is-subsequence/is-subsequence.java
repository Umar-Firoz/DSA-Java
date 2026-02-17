class Solution {
    public boolean isSubsequence(String s, String t) {
          int l=0;int l1=0;
        int n=s.length();
        while(l<s.length()&& l1!=t.length()){
                if(t.charAt(l1)==s.charAt(l)){
                    l++;
                }
              l1++;

        }
        return l==n;
    }
}