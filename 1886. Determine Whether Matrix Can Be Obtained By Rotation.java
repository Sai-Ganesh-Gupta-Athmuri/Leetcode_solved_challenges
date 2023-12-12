class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int r = mat.length;
        int c = mat[0].length;
        int c1 = 0;
        for(int k = 0;k < 4;k++){
            c1 = 0;
            for(int i = 0;i<r;i++){
                for(int j = 0;j<=i;j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for(int i = 0;i<r;i++){
                for(int j = 0;j<c/2;j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][c-j-1];
                    mat[i][c-j-1] = temp;
                }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == target[i][j]) {
                        c1+=1;
                    }
                }
            }
            if(c1 == r*c){
                return true;
            }
        }
        return false;
    }
}
