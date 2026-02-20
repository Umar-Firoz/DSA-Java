class Solution {
    public int divisorSubstrings(int num, int k) {

        int c = 0;
        String s = String.valueOf(num);
        int l = 0;
        int r = 0;
        String combined = "";

        while (r < s.length()) {

            combined += s.charAt(r);  

            if (r - l + 1 == k) {

                int n = Integer.parseInt(combined);

                if (n != 0 && num % n == 0)
                    c++;

                combined = combined.substring(1); 
                l++;
            }

            r++;
        }

        return c;
    }
}