class Solution {
    public int minimumRecolors(String s, int k) {
        int l=0;
        int wc=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W')
            wc++;
        }
        int min=wc;
        for(int r=k;r<s.length();r++){
            if(s.charAt(l)=='W')
                wc--;
            if(s.charAt(r)=='W')  
                wc++;   
            l++;
            min=Math.min(min,wc);
        }  
        return min; 
    }
}