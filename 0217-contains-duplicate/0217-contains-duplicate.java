class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> onceoccure = new HashSet<>();
        for (int num : nums){
            if (!onceoccure.add(num)){
                return true;
            }
        }
        return false;
    }
}