class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even = new int[nums.length/2];
        int[] odd = new int[nums.length/2];
        int j = 0,k = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                even[j] = nums[i];
                j++;
            }else{
                odd[k] = nums[i];
                k++;
            }
        }
        int m = 1,n=0,p=0;
        for(int i = 0;i<nums.length;i+=2){
            nums[i] = even[n];
            nums[m] = odd[p];
            m+=2;
            n++;
            p++;
        }
        return nums;
    }
}
