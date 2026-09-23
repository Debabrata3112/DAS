class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(nums, 0, n-1);
            return ;
        }
        for(int i=n-1;i>index;i--)
        {
            if(nums[index]<nums[i])
            {
                swap(nums, index, i);
                break;
            }
        }
        reverse(nums, index+1, n-1);
    }

    private void reverse(int [] arr,int s,int e)
    {
        while(s<e)
        {
            swap(arr, s, e);
            s++;
            e--;
        }
    }
    private void swap(int [] arr, int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}