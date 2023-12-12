class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i = 0;i < nums.length;i++){
            int c1 = count(nums[i]);
            if(c1%2 == 0){
                c+=1;
            }
        }
        return c;
    }
    public int count(int n){
        int r = 0;
        int c = 0;
        while(n!=0){
            r = n%10;
            n = n/10;
            c+=1;
        }
        return c;
    }
}
