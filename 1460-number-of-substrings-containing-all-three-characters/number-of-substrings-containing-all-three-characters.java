class Solution {
    public int numberOfSubstrings(String s) {
        int lastA = -1, lastB = -1, lastC = -1;
    int count = 0;

    for (int i = 0; i < s.length(); i++) {

        if (s.charAt(i) == 'a') lastA = i;
        if (s.charAt(i) == 'b') lastB = i;
        if (s.charAt(i) == 'c') lastC = i;

        if (lastA != -1 && lastB != -1 && lastC != -1) {
            count += Math.min(lastA, Math.min(lastB, lastC)) + 1;
        }
    }

    return count;
    }
}