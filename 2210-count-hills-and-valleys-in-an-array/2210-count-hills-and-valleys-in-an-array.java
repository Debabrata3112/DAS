class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        int prev = 0;
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if ((nums[i] > nums[prev] && nums[i] > nums[i + 1]) ||
                    (nums[i] < nums[prev] && nums[i] < nums[i + 1])) {
                count++;
            }
            prev = i;
        }
        return count;
    }
}