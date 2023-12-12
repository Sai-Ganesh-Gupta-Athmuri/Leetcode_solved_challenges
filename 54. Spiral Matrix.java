class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> a = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;   
        int top = 0, down = r-1, left = 0, right = c-1;
        while(top <= down && left <= right){
            for(int i = left;i<=right;i++){
                a.add(matrix[top][i]);
            }
            top += 1;
            for(int i = top;i<=down;i++){
                a.add(matrix[i][right]);
            }
            right -= 1;
            if(top <= down){
                for(int i = right;i>=left;i--){
                    a.add(matrix[down][i]);
                }
                down -= 1;
            }
            if(left<=right){
                for(int i = down;i>=top;i--){
                    a.add(matrix[i][left]);
                }
                left+=1;
            }
        }
        return a;
    }
}
