class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }else{
                mid++;
            }
        }
    }
}
