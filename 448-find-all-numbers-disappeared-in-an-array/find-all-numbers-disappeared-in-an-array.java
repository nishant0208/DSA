class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> Disappeared = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }
        for( int i =1 ; i<= nums.length; i++){
            if(!set.contains(i)){
                Disappeared.add(i);
            }
        }
        return Disappeared;
    }
}