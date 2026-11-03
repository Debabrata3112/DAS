class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int left=1;
        int right=maxOne(nums);
        int ans=0;
        while(left<=right){
            int sum=0;
            int mid=left+(right-left)/2;
            for (int num : nums) {
                // double ceilVal=Math.ceil((double)num/mid);
                // sum=sum+(int)ceilVal;
                sum+=(num-1)/mid+1;
            }
            if (sum <= threshold) {
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }

    private int maxOne(int [] nums){
        int maxVal=0;
        for(int num:nums){
            maxVal=Math.max(maxVal, num);
        }
        return maxVal;
    }
}