class Solution {
    public int jump(int[] nums) {
        int st = 0;
        int end = 0;
        int far = 0;
        int jumps = 0;
        for(int i = 0;i<nums.length-1;i++){
            far = Math.max(far,i+nums[i]);
            if(i == end){
                jumps++;
                end = far;
            }
        }
        return jumps;
    }
}
