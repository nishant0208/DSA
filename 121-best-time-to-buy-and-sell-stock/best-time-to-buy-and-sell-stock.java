class Solution {
    public int maxProfit(int[] prices) {
         int p =0, pp=prices[0];
        for(int n: prices){
            if(n<pp) pp=n;
            else if(n-pp>p)p = n - pp;
        }
        return p;
    }
}