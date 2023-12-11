class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        int sum = 0;
        for(int i = 0;i<accounts.length;i++){
            sum = 0;
            for(int j = 0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            arr[i] = sum;
        }
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
