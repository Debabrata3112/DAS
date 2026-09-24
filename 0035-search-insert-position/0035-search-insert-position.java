class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length;
        int left=0;
        int right =nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                index = mid;
                right = mid - 1;
            }
            else{
                left = mid+1;
            }
        }
        return index;
    }
}