public class No_66_Plus_One {
    public int[] plusOne(int[] arr) {
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]<9)
            {
                arr[i]+=1;
                return arr;
            }
            arr[i]=0;
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }
}
