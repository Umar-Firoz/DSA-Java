public class No_509_Fibonacci_Number {

    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<n;i++)
        {
            c=a+b;
            int temp=b;
            b=c;
            a=temp;
        }
        return c;
    }
}