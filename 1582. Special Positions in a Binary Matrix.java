class Solution {
    public int numSpecial(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        int c1 = 0;
        for(int i = 0;i<arr.size();i+=2){
            int c = 0;
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[arr.get(i)][j]==1) c++;
            }
            for(int k = 0;k<matrix.length;k++){
                if(matrix[k][arr.get(i+1)]==1) c++;
            }
            if(c==2) c1++;
        }
        return c1;
    }
}
