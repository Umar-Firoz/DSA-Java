class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(isVowel(ch[l])&&isVowel(ch[r]))
            {
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }  
            if(!isVowel(ch[l]))
                l++;
            if(!isVowel(ch[r]))
                r--; 
        }
        return new String(ch);
    }
    static boolean isVowel(char c)
    {
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
}