class Solution {
    public boolean canConstruct(String ransom, String mag) {
        if(mag.length()<ransom.length())
            return false;
        int[] m=new int[26];int l=ransom.length();
        
        for(int i=0;i<mag.length();i++){
            m[mag.charAt(i)-'a']++;
        }
        for(int i=0;i<ransom.length();i++){
           if(m[ransom.charAt(i)-'a']!=0){
               m[ransom.charAt(i)-'a']--;
               l--;
           }
        }
        return l==0;
    }
}