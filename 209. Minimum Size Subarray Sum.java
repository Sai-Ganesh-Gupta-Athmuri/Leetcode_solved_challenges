class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int len = 0;
        int res = n+1;
        int i=0;
        int j=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                len = j-i+1;
                res = Math.min(res,len);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(res == n+1) return 0;
        else return res;
    }
}
