class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight=0;
        int totalWeight=0;
        int exactCapacity=0;
        for(int weight:weights){
            maxWeight=Math.max(maxWeight, weight);
            totalWeight=totalWeight+weight;
        }
        int left=maxWeight;
        int right=totalWeight;
        while(left<=right){
            int mid=left+(right-left)/2;
            int daysReq=estimateDaysReq(weights, mid);
            if(daysReq<=days){
                exactCapacity=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return exactCapacity;
    }
    private int estimateDaysReq(int [] weights,int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days+=1;
                load=weights[i];
            }
            else{
                load=load+weights[i];
            }
        }
        return days;
    }
}