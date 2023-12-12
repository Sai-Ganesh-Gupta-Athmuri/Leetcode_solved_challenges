class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int c = 1;
        int top = 0, down = n-1, left = 0, right = n-1;
        while(top<=down && left<=right){
            for(int i = left;i<=right;i++){
                arr[top][i] = c;
                c++;
            }
            top+=1;
            for(int i = top;i<=down;i++){
                arr[i][right] = c;
                c++;
            }
            right -= 1;
            if(top<=down){
                for(int i = right;i>=left;i--){
                    arr[down][i] = c;
                    c++;
                }
                down-=1;
            }
            if(left<=right){
                for(int i = down;i>=top;i--){
                    arr[i][left] = c;
                    c++;
                }
                left += 1;
            }
        }
        return arr;
    }
}
