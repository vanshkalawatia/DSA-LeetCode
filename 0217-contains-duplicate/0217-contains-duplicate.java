class Solution {
    public boolean containsDuplicate(int[] nums) {
           Set<Integer> onceoccure = new HashSet<>();
        for (int num : nums){
            boolean isAdded = onceoccure.add(num);
            if (!isAdded){
                return true;
            }
        }
        return false;
    }
}