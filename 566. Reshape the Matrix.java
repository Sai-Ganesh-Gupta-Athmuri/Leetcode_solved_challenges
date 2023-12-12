class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c){
            return mat;
        }else{
            int[][] arr = new int[r][c];
            int r1 = 0,c1 = 0;
            for(int i = 0;i<mat.length;i++){
                for(int j = 0;j<mat[0].length;j++){
                    arr[r1][c1] = mat[i][j];
                    c1++;
                    if(c1 == c){
                        r1++;
                        c1 = 0;
                    }
                }
            }
            return arr;
        }
    }
}
