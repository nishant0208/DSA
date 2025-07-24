class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder Result= new StringBuilder();
        for(int i =0; i< words.length; i++)
        {
            Result =Result.append(new StringBuilder(words[i]).reverse());
            if(i!=words.length-1)
            Result = Result.append(" ");
        }
        return Result.toString();
    }
}