class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j= 1;
        int k = 0;
        for(int i = 0;i<n;i+=2){
            arr[i] = nums[k];
            arr[j] = nums[n];
            k++;
            j+=2;
            n++;
        }
        return arr;
    }
}
