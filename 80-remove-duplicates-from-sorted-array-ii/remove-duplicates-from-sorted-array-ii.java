class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;  // points to the place where we can insert next valid element

        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
