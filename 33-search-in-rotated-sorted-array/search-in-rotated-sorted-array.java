class Solution {
    public int search(int[] arr, int k) {
         int p = pivot(arr);
      int ans;

      if(k >= arr[0]) {
          ans = binarySearch(arr, k, 0, p);
      } else {
          ans = binarySearch(arr, k, p + 1, arr.length - 1);
      }
      return ans;

    }
    static int binarySearch(int[] ar, int key, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (ar[m] == key) {
                return m ;
            } else if (key > ar[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
    static int pivot(int[] arr){
    int s = 0;
    int e = arr.length - 1;

    while(s < e){
        int m = s + (e - s)/2;

        if(arr[m] > arr[m+1])
            return m;

        if(arr[m] < arr[s])
            e = m - 1;
        else
            s = m + 1;
    }

    return s;
    }
}