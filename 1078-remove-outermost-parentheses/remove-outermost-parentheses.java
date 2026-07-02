class Solution {
    public String removeOuterParentheses(String s) {
   StringBuilder ans = new StringBuilder();
   int c=0;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (c>0) {
                    ans.append(ch);
                }
                c++;
            } else {
                c--;
                if (c>0) {
                    ans.append(ch);
                }
                }
        }
        return ans.toString();
    }
}

//stack solutin this is not optimal
// class Solution {
//     public String removeOuterParentheses(String s) {
//    StringBuilder ans = new StringBuilder();
//         Stack<Character> stack = new Stack<>();
//         for (char ch : s.toCharArray()) {
//             if (ch == '(') {
//                 if (!stack.isEmpty()) {
//                     ans.append(ch);
//                 }
//                 stack.push(ch);
//             } else {
//                 stack.pop();
//                 if (!stack.isEmpty()) {
//                     ans.append(ch);
//                 }}
//         }
//         return ans.toString();
//     }
// }