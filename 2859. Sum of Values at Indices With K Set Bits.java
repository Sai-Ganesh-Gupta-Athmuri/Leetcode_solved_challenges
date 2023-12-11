class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0;i<nums.size();i++){
            int c = 0;
            int n = i;
            while(n>0){
                c++;
                n = n&(n-1);
            }
            if(c==k){
                sum+=nums.get(i);
            }
            c = 0;
        }
        return sum;
    }
}
