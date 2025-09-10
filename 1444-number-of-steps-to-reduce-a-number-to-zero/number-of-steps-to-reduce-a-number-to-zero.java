class Solution {
    public int numberOfSteps(int num) {
        return helper(num , 0);
    }
    private int helper(int num , int c)
    {
        if(num == 0)
        {
            return c;
        }
        if((num & 1) == 1){
           return helper(--num , ++c);
        }
        else return helper (num/2 , ++c);
    }
}