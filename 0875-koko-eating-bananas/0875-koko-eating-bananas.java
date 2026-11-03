class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBanana=0;
        int k=0;
        for(int max:piles){
            maxBanana=Math.max(max, maxBanana);
        }
        int left=1;
        int right=maxBanana;
        while(left<=right){
            int mid=left+(right-left)/2;
            int total=0;
            for(int pile:piles){
                total+=(pile-1)/mid+1;
                if(total>h){
                    break;
                }
            }
            if(total<=h){
                k=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return k;
    }
}