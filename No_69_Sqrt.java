public class No_69_Sqrt {

    public static void main(String[] args) {
        int x=8;
        System.out.println((int)Math.sqrt(x)); 
    }
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid = -1;
        
        if (x == 0) {
            return 0;
        }

        while (left <= right) {
            mid = left + (right - left) / 2;
            long squared = (long) mid * mid;

            if (squared == x) {
                return mid;
            }
            else if (squared < x) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return right;
    }
}
