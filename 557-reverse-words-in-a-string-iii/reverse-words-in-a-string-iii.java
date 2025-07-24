class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        String w="", ans="";
        char ch;

        for(int i = 0 ; i< s.length(); i++)
        {
            ch=s.charAt(i);
            // while(ch!=' ')
            // {
                w=ch+w;
            //}
            if(ch==' ')
            {
            ans=ans+w;
            w="";
            }
        }
        return ans.trim();
    }
}