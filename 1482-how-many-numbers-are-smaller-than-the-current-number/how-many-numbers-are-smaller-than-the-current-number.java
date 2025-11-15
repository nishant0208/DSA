class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int c  =0;
        int i =0;
        int [] res  = new  int [nums.length];
        for ( int n : nums){
            for (int m : nums){
                if(n>m) c++;
            }
            res[i]= c;
            c=0;
            i++;
        }
         return res;
    }
}