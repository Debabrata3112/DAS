class Solution {
    public int countQuadruplets(int[] nums) {
        int n=nums.length;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int c=2;c<n-1;c++)
        {
            for(int a=0;a<c-1;a++)
            {
                int pairSum=nums[a]+nums[c-1];
                map.put(pairSum,map.getOrDefault(pairSum,0)+1);
            }

            for(int d=c+1;d<n;d++)
            {
                int rem=nums[d]-nums[c];
                count += map.getOrDefault(rem,0 );
            }
        }
        return count;
    }
}