class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(longestT(s,k),longestF(s,k));
    }
    public int longestT(String s, int k) {

    int z = 0;
    int l = 0;
    int r = 0;
    int max = 0;

    while (r < s.length()) {

        if (s.charAt(r) == 'F') {
            z++;
        }

        if (z > k) {
            if (s.charAt(l) == 'F')
                z--;
            l++;
        }

        if (z <= k) {
            max = Math.max(max, r - l + 1);
        }

        r++;
    }

    return max;
    }  
      public int longestF(String s, int k) {

    int z = 0;
    int l = 0;
    int r = 0;
    int max = 0;

    while (r < s.length()) {

        if (s.charAt(r) == 'T') {
            z++;
        }

        if (z > k) {
            if (s.charAt(l) == 'T')
                z--;
            l++;
        }

        if (z <= k) {
            max = Math.max(max, r - l + 1);
        }

        r++;
    }

    return max;
    }   
}