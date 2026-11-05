class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;

        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isPossible(nums, k, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] nums, int k, int mid) {

        int subarrays = 1;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (currentSum + nums[i] > mid) {
                subarrays++;
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            if (subarrays > k) {
                return false;
            }
        }

        return true;
    }
}