class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = 0;
            }
        }
        int c = 0;
        for(int i = 0;i<indices.length;i++){
            int j = 0;
            int a = indices[i][j];
            int b = indices[i][j+1];
            for(int k = 0;k<n;k++){
                arr[a][k] += 1;
            }
            for(int k = 0;k<m;k++){
                arr[k][b] += 1;
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                // System.out.print(arr[i][j]+" ");
                if(arr[i][j]%2!=0){
                    c+=1;
                }
            }
        }
        return c;
    }
}
