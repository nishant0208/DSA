class Solution {
    public String restoreString(String s, int[] indices) {
        String result = "";
        for (int i =0;i<s.length();i++)
        {
            for(int j = 0; j<s.length(); j++)
            if(indices[j] == i)
            result = result + s.charAt(j);
        }
        return result;
    }
}