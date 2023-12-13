class Solution {
    public int sumOfSquares(int[] arr) {
        int n = arr.length;
        int c= 0,c1 = 0;
        for(int i = 0;i< n;i++){
            if(n % (i+1) == 0){
                c1 = arr[i]*arr[i];
                c+=c1;
            }
        }return c;
    }
}
