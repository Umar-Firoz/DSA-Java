class Solution {
    public boolean isHappy(int n) {
        int x=n; 
       while(x!=4)
       {
        int sum = 0;
        while(x!=0)
        {
            int d = x % 10;
            sum = sum + (d*d);
            x/=10; 
        }
        x=sum;
        if (sum==1)
        return true;
        }
        return false;
    }
}