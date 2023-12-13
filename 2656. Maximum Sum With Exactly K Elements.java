import java.util.*;
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int score = 0;
        int score1 = nums[nums.length-1];
        for(int i = 0;i<k;i++){
            score+=nums[nums.length-1];
            score1+=1;
            nums[nums.length-1] = score1;
        }
        return score;
    }
}
