class Solution {

    //recursion code
    public int fib(int n) {
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);    
    }

    // optimized code here
    
    public int fibOpt(int n) {
        int f = 0;
        int s = 1;
        int result = 0;
        if (n == 0) {
            return f;
        } else if (n == 1) {
            return s;
        }
        for (int i = 2; i <= n; i++) {
            int temp = s + f;
            f = s;
            s = temp;
            result = temp;
        }
        return result;
    
        }
}