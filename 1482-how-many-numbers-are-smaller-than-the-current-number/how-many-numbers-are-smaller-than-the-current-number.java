class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
            int c=0;
            int[] arr=new int[nums.length];
        for (int i = 0 ;i<nums.length;i++)
        {
             for (int j = 0 ;j<nums.length;j++)
             {
                if(nums[i]>nums[j]){
                    c++;
                }
                
             }
             arr[i]=c;
                c=0;
        }
        return (arr);
    }
}