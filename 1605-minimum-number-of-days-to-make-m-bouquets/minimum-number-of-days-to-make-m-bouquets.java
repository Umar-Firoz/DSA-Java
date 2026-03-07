class Solution {
    public int minDays(int[] arr, int m, int k) {
     
        int s = min(arr);
        
        int e = max(arr);
        if (((long) m * k) > arr.length)
            return -1;
        else {
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (check(arr, m, k,mid))
                e = mid;
            else
                s = mid + 1;
        }
        }
        return s;
    }
        static int max(int[] arr){
        int max=0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
    static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }
      static boolean check(int[] arr,int m,int k, int mid){
        int x=0;
        int c=0;
        for(int i: arr){
            if(i<=mid){
                x++;
                if(x==k)
                {
                    c++;
                    x=0;
                }
            }
            else{
                x=0;
            }
            if(c==m)
                return true;
        }
        return false;
    }
}