class Solution {
    public int[] findErrorNums(int[] nums) {
       int n  = nums.length;
       int expectedsum = (1+n)*n/2;
       Set<Integer> uniqueNumbers = new HashSet<>();
       int uniqueSum =0;
       int actualSum = 0;
       for(int num: nums){
        if(uniqueNumbers.add(num)){
            uniqueSum+= num;

        }
        actualSum +=num;
       }
       int duplicate = actualSum - uniqueSum;
       int missing = expectedsum - uniqueSum;
       return new int[] {duplicate , missing};
    }
}