class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = {0,0};
        for(int i = 0;i<mat.length;i++){
            int c = 0;
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c>arr[1]){
                arr[0] = i;
                arr[1] = c;
            }
        }
        return arr;
    }
}
