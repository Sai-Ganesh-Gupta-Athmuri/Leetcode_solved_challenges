class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(nums.length==1){
            return ;
        }
        int l = nums.length - k , j = nums.length-1;
        while(l<j){
            int temp = nums[l];
            nums[l] = nums[j];
            nums[j] = temp;
            l++;
            j--;
        }
        int l1 = 0, j1 = nums.length-k-1;
        while(l1<j1){
            int temp = nums[l1];
            nums[l1] = nums[j1];
            nums[j1] = temp;
            l1++;
            j1--;
        }
        int l2 = 0, j2 = nums.length-1;
        while(l2<j2){
            int temp = nums[l2];
            nums[l2] = nums[j2];
            nums[j2] = temp;
            l2++;
            j2--;
        }
    }
}
