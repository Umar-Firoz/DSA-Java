class Solution {
   static int[] decrypt(int[] code, int k) {

    int[] arr = new int[code.length];
    int sum = 0;
    int n = code.length;

    if (k > 0) {
        for (int i = 1; i <= k; i++) {
            sum += code[i];
        }
    }

    if (k < 0) {
        for (int i = n + k; i < n; i++) {
            sum += code[i];
        }
    }

    for (int i = 0; i < n; i++) {

        if (k > 0) {
            arr[i] = sum;
            sum -= code[(i + 1) % n];
            sum += code[(i + k + 1) % n];
        }

        else if (k == 0) {
            arr[i] = 0;
        }

        else {
            int kp = -k;

            arr[i] = sum;

            sum -= code[(i - kp + n) % n];   
            sum += code[i];                  
        }
    }

    return arr;
}
}