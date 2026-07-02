class Solution {
    public String removeOuterParentheses(String s) {
   StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!stack.isEmpty()) {
                    ans.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    ans.append(ch);
                }}
        }
        return ans.toString();
    }
}