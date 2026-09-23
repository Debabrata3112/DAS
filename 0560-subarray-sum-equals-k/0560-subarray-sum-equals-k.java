class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int count =0;
        int n=nums.length;
        for(int j=0;j<n;j++)
        {
            prefixSum=prefixSum+nums[j];
              int rem=prefixSum-k;
            if(map.containsKey(rem) )
            {
               count = count + map.get(rem);
            } 
            map.put(prefixSum , map.getOrDefault(prefixSum, 0)+1 );
        }
        return count ;
    }
}