class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for (int num : nums) {
            right = Math.max(right, num);
        }
        while(left<=right){
            int sum=0;
            int mid=left+(right-left)/2;
            for (int num : nums) {
                sum+=(num-1)/mid+1;
                if (sum > threshold) {
                    break;
                }
            }
            if (sum <= threshold) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}