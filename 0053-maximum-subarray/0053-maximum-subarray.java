class Solution {
    public int maxSubArray(int[] nums) {
         int sum=0;
        int largest_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            largest_sum=Math.max(largest_sum, sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return largest_sum;
    }
}