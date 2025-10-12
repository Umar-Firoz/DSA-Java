public class No_14_Palindrome {
    public boolean isPalindrome(int x) {
        int i=x;
        int rev=0;
        while(i!=0)
        {
            int d=i%10;
            rev=rev*10+d;
            i/=10;
        }
        if(rev==x && x>=0)return true;
        else return false;
    }
}