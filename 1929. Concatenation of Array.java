class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        int k = 0;
        for(int j = nums.length;j<2*nums.length;j++){
            arr[j] = nums[k];
            k++;
        }
        return arr;
    }
}
