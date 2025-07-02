class Solution {
    public boolean isPalindrome(int x) {
        int xc=x; //x's copy xc
        int d, rev=0;
       while (xc>0){
        d = xc % 10;
        rev = rev * 10 + d;
        xc = xc / 10;
       }
       return(rev==x);
    }
}
