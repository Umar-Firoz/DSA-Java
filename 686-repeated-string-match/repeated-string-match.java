class Solution {
    public int repeatedStringMatch(String a, String b) {
   
     int l=(b.length()/a.length())+2;
        int i=1;
        StringBuilder str = new StringBuilder();
        while(i<=l){
            str.append(a);
            if(str.toString().contains(b)){
                return i;
            }
          i++;
        }
        return -1;
    }
}