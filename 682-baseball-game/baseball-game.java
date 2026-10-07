class Solution {
    public int calPoints(String[] op){
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<op.length;i++){
            if (!op[i].equals("C") && !op[i].equals("D") && !op[i].equals("+")) {
                    stack.push(Integer.valueOf(op[i]));
            }
            else {
                if(stack.isEmpty()){
                    continue;
                }
                if(op[i].equals("C")){
                        stack.pop();
                } else if (op[i].equals("D")) {
                    int d=stack.peek();
                    stack.push(d*2);
                } else if (op[i].equals("+")) {
                    int a=stack.pop();
                    int b=stack.peek();
                    stack.push(a);
                    stack.push(a+b);
                    System.out.println(stack);
                }
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}