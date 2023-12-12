class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        int st = search(arr,target,true);
        int end = search(arr,target,false);
        ans[0] = st;
        ans[1] = end;
        return ans;
    }
    public int search(int[] arr,int target,boolean index){
        int ans = -1;
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid] < target){
                st = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                ans = mid;
                if(index){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
        }
        return ans;
    }
}
