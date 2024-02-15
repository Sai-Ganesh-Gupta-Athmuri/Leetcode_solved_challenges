class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int k = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]>0) {
                arr[k] = nums[i];
                k++;
            }
        }
        for(int i = 0;i<n;i++){
            if(nums[i]<0) {
                arr[k] = nums[i];
                k++;
            }
        }
        // for(int i = 0;i<n;i++) System.out.print(arr[i]+" ");
        int l = 0;
        int j = n/2;
        for(int i = 0;i<n;i+=2){
            nums[i] = arr[l];
            nums[i+1] = arr[j];
            l++;
            j++;
        }
        return nums;
    }
}
