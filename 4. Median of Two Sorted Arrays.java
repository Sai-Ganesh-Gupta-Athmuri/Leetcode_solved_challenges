class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int i = 0,j = 0, k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }else{
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }while(i<nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        double result = 0;
        if(arr.length%2!=0){
            result = arr[arr.length/2]*1.0;
        }else{
            result = ((double)(arr[arr.length/2]+arr[arr.length/2-1])/2);
        }
        return result;
    }
}
