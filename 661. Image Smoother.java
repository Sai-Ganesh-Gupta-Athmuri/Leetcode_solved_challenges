class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = pooling(img,i,j,m,n);
            }
        }
        return arr;
    }
    public int pooling(int[][] img,int i, int j, int m, int n){
        int sum = 0,c = 0;
        for(int x = -1;x<2;x++){
            for(int y = -1;y<2;y++){
                int nx = x+i;
                int ny = y+j;
                if(nx<0 || nx>=m || ny<0 || ny>=n){
                    continue;
                }else{
                    sum += img[nx][ny];
                    c++;
                }
            }
        }
        return sum/c;
    }

}
