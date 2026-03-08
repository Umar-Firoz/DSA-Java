class Solution {
    public boolean searchMatrix(int[][] arr, int target) {

        if(target < arr[0][0])
            return false;

        int r = rowSearch(arr, target);   // no -1

        int s = 0;
        int e = arr[0].length - 1;

        while(s <= e){
            int m = s + (e - s)/2;

            if(arr[r][m] == target)
                return true;
            else if(arr[r][m] < target)
                s = m + 1;
            else
                e = m - 1;
        }

        return false;
    }

    static int rowSearch(int[][] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int m = s + (e - s)/2;

            if(arr[m][0] <= target)
                s = m + 1;
            else
                e = m - 1;
        }

        return e;   // last valid row
    }
}