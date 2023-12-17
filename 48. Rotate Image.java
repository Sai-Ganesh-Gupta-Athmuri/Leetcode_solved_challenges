class Solution {
    public void rotate(int[][] mat) {
        int r = mat.length;
        for(int i = 0;i<r;i++){
            for(int j = i+1;j<r;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<r/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][r-j-1];
                mat[i][r-j-1] = temp;
            }
        }
    }
}
