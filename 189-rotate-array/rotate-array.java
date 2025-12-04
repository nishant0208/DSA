class Solution {
    public void rotate(int[] nums, int k) {
        int start =0;
        int end = nums.length;
        k = k%end;
        nums=reverse( nums, start , end-1);
        nums =reverse( nums, start , k-1);
        nums=reverse( nums, k , end-1);
        //return nums;
    }
    int[] reverse(int[] nums,int start , int end){
        while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
        return nums;
    }
}