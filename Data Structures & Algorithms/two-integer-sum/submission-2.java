

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> seen = new HashMap<>(n * 4 / 3 + 1);
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            Integer j = seen.get(complement);
            if (j != null) {
                return new int[] { j, i };
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }
}