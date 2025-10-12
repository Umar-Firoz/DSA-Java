public class No_70_Climbing_Stairs {
        public int climbStairs(int n) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            int temp=b;
            b=c;
            a=temp;
        }
        return c;
    }
}
