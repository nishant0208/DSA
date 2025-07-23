class Solution {
    public String freqAlphabets(String s) {
        String ans = "";
        int i = 0;
        
        while (i < s.length()) {
            // Check if we can form a two-digit number with a '#' at the 3rd place
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2)); // correct way to get two-digit number
                ans += (char)('a' + num - 1); // 'a' + 10 - 1 = 'j'
                i += 3; // skip 3 chars (10#)
            } else {
                int num = s.charAt(i) - '0'; // convert char to digit
                ans += (char)('a' + num - 1);
                i += 1;
            }
        }
        
        return ans;
    }
}
