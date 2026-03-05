class Solution {
    public char nextGreatestLetter(char[] ar, char target) {
        int s=0;
        int e=ar.length;
        // if(target<ar[0])
        //     return ar[0];
        // if(target>=ar[e-1])
        //     return ar[0];
        while(s<e){
            int m=s+(e-s)/2;
            if(ar[m]<=target)
                s=m+1;
            else 
                e=m;
        }
        return ar[s%ar.length];
    }
}