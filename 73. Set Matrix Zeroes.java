class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        for(int i = 0;i<arr.size();i+=2){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[arr.get(i)][j] = 0;
            }
            for(int k = 0;k<matrix.length;k++){
                matrix[k][arr.get(i+1)] = 0;
            }
        }
    }
}
