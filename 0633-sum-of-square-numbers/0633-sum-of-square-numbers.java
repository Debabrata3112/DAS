class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0;(long)i*i<=c;i++){
            int remain=(int)(c - (long)i * i);
            if(isPerfectSquare(remain)){
                return true;
            }
        }
        return false;
    }
    private boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int left=1;
        int right=num/2;
        while(left <= right){
            int mid=left+(right-left)/2;
            if(mid==num/mid && num%mid==0){
                return true;
            }
            else if(mid > num/mid){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}