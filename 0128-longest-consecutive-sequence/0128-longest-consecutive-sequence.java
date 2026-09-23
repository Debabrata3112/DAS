class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        int count;
        int longest=1;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int s:set){
            if(!set.contains(s-1))
            {
                count=1;
                int current = s;
                while(set.contains(current+1))
                {
                    current =current+1;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
        
    }
}