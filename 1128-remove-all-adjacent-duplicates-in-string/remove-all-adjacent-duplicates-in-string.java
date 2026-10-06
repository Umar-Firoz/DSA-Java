class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> stack=new Stack<>();
        for (char ch : s.toCharArray()){
            if(stack.isEmpty())
            {
                stack.push(ch);
                continue;
            }
            if (stack.peek()==ch){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
       // System.out.println(stack);
        StringBuilder sb=new StringBuilder();
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}