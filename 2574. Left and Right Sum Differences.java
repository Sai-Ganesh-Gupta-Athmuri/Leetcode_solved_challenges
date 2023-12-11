class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length];
        left[0] = 0;
        right[right.length - 1] = 0;
        int sum = 0,sum1 = 0;
        for(int i = 0;i<nums.length-1;i++){
            sum = 0;
            for(int j = i+1;j<nums.length;j++){
                sum+=nums[j];
            }
            right[i] = sum;
        }

        for(int i = 1;i<nums.length;i++){
            sum1 = 0;
            for(int j = i-1;j>=0;j--){
                sum1+=nums[j];
            }
            left[i] = sum1;
        }

        for(int i = 0;i<nums.length;i++){
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }
}
