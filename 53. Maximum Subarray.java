class Solution {
    public int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = (arr[i] > maxEndingHere + arr[i]) ? arr[i] : maxEndingHere + arr[i];
            maxSoFar = (maxEndingHere > maxSoFar) ? maxEndingHere : maxSoFar;
        }
        return maxSoFar; 
    }
}
