class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[] rowOnes = new int[r];
        int[] colOnes = new int[c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(grid[i][j] == 1){
                    rowOnes[i]++;
                    colOnes[j]++;
                }
            }
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                grid[i][j] = 2*rowOnes[i] + 2*colOnes[j] - r -c;
            }
        }
        return grid;
    }
}
