class Solution {
    public boolean isPalindrome(int x) {
        String str;
        String rev="";
        char ch;
        boolean flag=false;
        str=Integer.toString(x);
         for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev; 
        }
        if (rev.equals(str))
        {
            flag =true;
        }
        return flag;
        
    }
}