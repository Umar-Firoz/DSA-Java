class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2)
            return false;

        int[] pattern = new int[26];   // frequency of s1
        int[] window  = new int[26];   // frequency of current window in s2

        // Step 1: Build frequency for s1
        for (int i = 0; i < len1; i++) {
            pattern[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        // Step 2: Slide window over s2
        for (int right = 0; right < len2; right++) {

            // Add current character to window
            window[s2.charAt(right) - 'a']++;

            // If window size exceeds len1, remove left character
            if (right - left + 1 > len1) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }

            // If window size equals len1, compare frequencies
            if (right - left + 1 == len1) {
                if (areEqual(pattern, window))
                    return true;
            }
        }

        return false;
    }

    private boolean areEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}