class Solution {
    public int calculate(String s) {
        int result = 0, lastNumber = 0, number = 0;
        char sign = '+';
        s = s.replaceAll(" ", "");
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }
            
            if (!Character.isDigit(c) || i == s.length() - 1) {
                if (sign == '+') {
                    result += lastNumber;
                    lastNumber = number;
                } else if (sign == '-') {
                    result += lastNumber;
                    lastNumber = -number;
                } else if (sign == '*') {
                    lastNumber = lastNumber * number;
                } else if (sign == '/') {
                    lastNumber = lastNumber / number;
                }
                sign = c;
                number = 0;
            }
        }
        
        result += lastNumber;
        return result;
    }
}