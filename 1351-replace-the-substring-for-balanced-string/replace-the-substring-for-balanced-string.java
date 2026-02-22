class Solution {
    public int balancedString(String s) {

        int n = s.length();
        int required = n / 4;

        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }


        if (freq['Q'] == required &&
            freq['W'] == required &&
            freq['E'] == required &&
            freq['R'] == required)
            return 0;

        int left = 0;
        int min = n;

        for (int right = 0; right < n; right++) {

            freq[s.charAt(right)]--;

            while (left < n &&
                   freq['Q'] <= required &&
                   freq['W'] <= required &&
                   freq['E'] <= required &&
                   freq['R'] <= required) {

                min = Math.min(min, right - left + 1);

                freq[s.charAt(left)]++;
                left++;
            }
        }

        return min;
    }
}