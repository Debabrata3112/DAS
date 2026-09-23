class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        return find(nums, right, left, target);
    }

    public int find(int [] nums,int right,int left,int target)
    {
        while(left<=right)
        {
            int mid = left + (right - left) / 2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
    
}