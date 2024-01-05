class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        int c = 0;
        for(int ele : nums) {
            int i = 0;
            int j = c;
            while(i!=j){
                int mid = (i+j)/2;
                if(arr[mid] < ele){
                    i = mid+1;
                }else{
                    j = mid;
                }
            }
            arr[i] = ele;
            if(i == c){
                c++;
            }
        }
        return c;
    }
}
