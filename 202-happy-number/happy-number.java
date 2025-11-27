class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;

        do {
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        } while(fast!=slow);

        if(slow==1) return true;
        return false;
    }
    private int getNextNumber(int n) {
        int output = 0;
        
        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }
        
        return output;
    }
}