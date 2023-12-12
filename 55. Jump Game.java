class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return true;
        }
        int f = n-1;
        for(int i = f-1;i>=0;i--){
            if(nums[i] + i >= f){
                f = i;
            }
        }
        return f==0;
    }
}
