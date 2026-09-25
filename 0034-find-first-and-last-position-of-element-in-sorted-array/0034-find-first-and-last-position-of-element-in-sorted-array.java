class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int start =-1;
        int end =-1;

        //find first occourance
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                start = mid;
                right = mid - 1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        //find end occourence
        right=nums.length-1;
        left=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                end = mid;
                left = mid + 1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        return new int []{start,end};
    }
}