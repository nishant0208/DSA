class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        String w="";
        boolean flag=false;
        for(char ch : s.toCharArray())
        {
            if(ch=='6'&& flag==false)
            {
            w=w+'9';
            flag=true;
            }
            else
            w=w+ch;
        }
        return (Integer.parseInt(w));
    }
}