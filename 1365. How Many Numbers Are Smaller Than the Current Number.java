class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int c = 0;
        for(int i = 0;i<nums.length;i++){
            c = 0;
            for(int j = 0;j<nums.length;j++){
                if(j!=i && nums[j]<nums[i]){
                    c+=1;
                }
            }
            arr[i] = c;
        }
        return arr;
    }
}
