class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        for(int i = 0;i<nums.length;i++){
            esum+=nums[i];
        }
        System.out.println(esum);
        int dsum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int r;
        for(int i = 0;i<nums.length;i++){
            while(nums[i]!=0){
                r = nums[i]%10;
                arr.add(r);
                nums[i] = nums[i]/10;
            }
        }
        for(int i : arr){
            dsum+=i;
        }
        System.out.println(dsum);
        int result = Math.abs(esum - dsum);
        return result;
    }
}
