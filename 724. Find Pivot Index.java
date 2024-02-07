class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int[] left = new int[n];
        left[0] = 0;
        int sum = 0;
        for(int i = 0;i<n;i++) sum+=nums[i];
        for(int i = 1;i<n;i++){
            left[i] = nums[i-1]+left[i-1];
        }
        for(int i = 0;i<n-1;i++){
            right[i] = sum - nums[i];
            sum = sum - nums[i];
        }
        // for(int i = 0;i<n;i++) System.out.print(left[i]+" ");
        // System.out.println();
        // for(int i = 0;i<n;i++) System.out.print(right[i] +" ");
        for(int i = 0;i<n;i++) {
            if(right[i] == left[i]) return i;
        }
        return -1;
    }
}
