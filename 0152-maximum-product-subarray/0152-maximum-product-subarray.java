class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int max= nums[0];   
        int min = nums[0];   
        int result   = nums[0];  

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];

            int tempMax = Math.max(cur, Math.max(max* cur, min * cur));
            min    = Math.min(cur, Math.min(max * cur, min * cur));
            max    = tempMax;

            result = Math.max(result, max);
        }
        return result;
    }
}