class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        if(nums.length%2!=0){
            return false;
        }
        int j = 1,c=0,k=0;
        for(int i = 0;i<nums.length/2;i++){
            if(nums[k]!=nums[j]){
                c+=1;
            }
            j+=2;
            k+=2;
        }
        return c==0;
    }
}
