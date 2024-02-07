class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += nums[i];
        }
        max = sum*1.0/k;
        for(int i = 1;i<nums.length-k+1;i++){
            sum  = sum - nums[i-1];
            sum = sum + nums[i+k-1];
            if(sum*1.0/k > max){
                max = sum*1.0/k;
            }
        }
        return max;
    }
}
