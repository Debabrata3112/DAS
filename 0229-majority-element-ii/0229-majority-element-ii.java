class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if (count1==0 && candidate2 != nums[i])
            {
                candidate1=nums[i];
                count1++;
            }
            else if (count2==0 && candidate1 != nums[i])
            {
                candidate2=nums[i];
                count2++;
            }

            else if(candidate1==nums[i])
            {
                count1++;
            }
            else if(candidate2==nums[i])
            {
                count2++;
            }

            else 
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums)
        {
            if(candidate1==num)
            {
                count1++;
            }
            if(candidate2==num)
            {
                count2++;
            }
        }
        if(count1 > n/3)
        {
            ans.add(candidate1);
        }
        if(count2 > n/3)
        {
            ans.add(candidate2);
        }
        return ans;
        
    }
}