class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] arr = new int[n/3][3];
        int j = 0;
        for(int i = 0;i<n-2;i+=3){
            if(nums[i+1] - nums[i] <= k && nums[i+2] - nums[i] <= k && nums[i+2] - nums[i+1] <= k){
                arr[j][0] = nums[i];
                arr[j][1] = nums[i+1];
                arr[j][2] = nums[i+2];
                j++;
                // for(int l = j-1;l<j;l++){
                //     for(int m = 0;m<3;m++){
                //         System.out.println(arr[l][m]+" "+j);
                //     }
                //     System.out.println();
                // }
            }
        }
        if(j != n/3) return new int[][]{};
        else return arr;
    }
}
