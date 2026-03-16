class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;

        StringBuilder newStr = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){

            if(newStr.toString().equals(goal))
                return true;

            char left = newStr.charAt(0);
            newStr.deleteCharAt(0);
            newStr.append(left);
        }

        return false;
    }
}