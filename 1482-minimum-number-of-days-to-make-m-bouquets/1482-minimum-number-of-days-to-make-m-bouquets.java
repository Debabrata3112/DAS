class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (k * m > n) {
            return -1;
        }
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }
        int right = maxDay;
        int left = minDay;
        int ans = -1;
        while (left <= right) {
            int bouquets = 0;
            int count = 0;
            int mid = left + (right - left) / 2;
            for (int bloom : bloomDay) {
                if (bloom <= mid) {
                    count += 1;
                    if (count == k) {
                        bouquets += 1;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }
            if (bouquets >= m) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}